package com.luckuless.code.interfaceSegragation.before;

/*
 * Bear keeper do not want to pet teh bear but since it is present in the interfac
 * the class will need to provide an implementation 
 */
public interface BearKeeper {
    void washTheBear();
    void feedTheBear();
    void petTheBear();
}
