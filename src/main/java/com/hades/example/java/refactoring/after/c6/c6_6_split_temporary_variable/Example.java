package com.hades.example.java.refactoring.after.c6.c6_6_split_temporary_variable;

public class Example {
    private int _primaryForce = 5;
    private double _mass = 5D;
    private int _delay = 10;
    private int _secondaryForce = 50;

    // 根据牛顿第二定律，计算布丁运动的距离
    double getDistanceTravelled(int time) {
        double result;
        final double primaryAcc = _primaryForce / _mass;// SESSION:: 1
        int primaryTime = Math.min(time, _delay);
        result = 0.5 * primaryAcc * primaryTime * primaryTime;// SESSION:: 1
        int secondaryTime = time - _delay;
        if (secondaryTime > 0) {
            double primaryVel = primaryAcc * _delay;
//            double acc = (_primaryForce + _secondaryForce) / _mass;// SESSION:: 2
//            double secondAcc = (_primaryForce + _secondaryForce) / _mass;// SESSION: 2
            final double secondAcc = (_primaryForce + _secondaryForce) / _mass;// SESSION: 2
            result += primaryVel * secondaryTime + 0.5 * secondAcc * secondaryTime * secondaryTime;// SESSION: 2
        }
        return result;
    }
}