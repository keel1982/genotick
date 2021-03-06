package com.alphatica.genotick.instructions;

import com.alphatica.genotick.mutator.Mutator;

import java.io.Serializable;

abstract public class DataRegInstruction extends DataInstruction implements Serializable {
    @SuppressWarnings("unused")
    private static final long serialVersionUID = 4226724935141470072L;

    private byte register;

    public byte getRegister() {
        return register;
    }

    void setRegister(byte register) {
        this.register = Registers.validateRegister(register);
    }

    @Override
    public void mutate(Mutator mutator) {
        super.mutate(mutator);
        register = Registers.validateRegister(mutator.getNextByte());
    }
}
