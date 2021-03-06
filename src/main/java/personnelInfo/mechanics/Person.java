/*
 * Copyright © 2020 MRN-Design (brand owned by Manufacture-MRN sp. z o.o.) and Mateusz Niedbał
 * As of January 2020, all rights in any software published by MRN-Design (brand owned by Manufacture-MRN sp. z o.o.) & Mateusz Niedbał will remain with the author. Contact the author with any permission requests.
 */

package personnelInfo.mechanics;

import personnelInfo.mechanics.enums.PersonType;

public class Person {

    private String NAME;
    private String SURNAME;
    private int AGE;

    private String position;
    private int ID;
    private PersonType workerType;

    public String getNAME() {
        return NAME;
    }

    public String getSURNAME() {
        return SURNAME;
    }

    public int getAGE() {
        return AGE;
    }

    public int getID() {
        return ID;
    }

    public String getPosition() {
        return position;
    }

    public PersonType getWorkerType() {
        return workerType;
    }

    public void setNAME(String NAME) {
        this.NAME = NAME;
    }

    public void setSURNAME(String SURNAME) {
        this.SURNAME = SURNAME;
    }

    public void setAGE(int AGE) {
        this.AGE = AGE;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public void setWorkerType(PersonType workerType) {
        this.workerType = workerType;
    }


    private Person(PersonBuilder builder) {
        this.NAME = builder.NAME;
        this.SURNAME = builder.SURNAME;
        this.AGE = builder.AGE;
        this.position = builder.position;
        this.ID = builder.ID;
        this.workerType = PersonType.ACTUAL;
    }

    public String print() {
        return "ID:"+ID+",  "+NAME+" "+SURNAME+", age:"+AGE+",  "+position+",  "+workerType.toString();
    }

    @Override
    public String toString() {
        return ID + ";" + NAME + ";" + SURNAME + ";" + AGE + ";" + position + ";" + workerType.toString() + ";\n";
    }


    static class PersonBuilder {

        private String NAME;
        private String SURNAME;
        private int AGE;

        private String position;
        private int ID;

        PersonBuilder(String NAME, String SURNAME, int AGE) {
            this.NAME = NAME;
            this.SURNAME = SURNAME;
            this.AGE = AGE;
        }

        PersonBuilder position(String position) {
            this.position = position;
            return this;
        }

        PersonBuilder ID(int ID) {
            this.ID = ID;
            return this;
        }

        Person build() {
            return new Person(this);
        }

    }
}