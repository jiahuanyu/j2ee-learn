/*
 * This file is generated by jOOQ.
 */
package me.jiahuan.java.model.tables.records;


import javax.annotation.Generated;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import me.jiahuan.java.enums.Gender;
import me.jiahuan.java.model.tables.User;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record3;
import org.jooq.Row3;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.11.9"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class UserRecord extends UpdatableRecordImpl<UserRecord> implements Record3<Integer, String, Gender> {

    private static final long serialVersionUID = 113058492;

    /**
     * Setter for <code>j2ee-learn.user.uid</code>.
     */
    public UserRecord setUid(Integer value) {
        set(0, value);
        return this;
    }

    /**
     * Getter for <code>j2ee-learn.user.uid</code>.
     */
    public Integer getUid() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>j2ee-learn.user.name</code>.
     */
    public UserRecord setName(String value) {
        set(1, value);
        return this;
    }

    /**
     * Getter for <code>j2ee-learn.user.name</code>.
     */
    @NotNull
    @Size(max = 10)
    public String getName() {
        return (String) get(1);
    }

    /**
     * Setter for <code>j2ee-learn.user.gender</code>.
     */
    public UserRecord setGender(Gender value) {
        set(2, value);
        return this;
    }

    /**
     * Getter for <code>j2ee-learn.user.gender</code>.
     */
    @NotNull
    public Gender getGender() {
        return (Gender) get(2);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Record1<Integer> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record3 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row3<Integer, String, Gender> fieldsRow() {
        return (Row3) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row3<Integer, String, Gender> valuesRow() {
        return (Row3) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field1() {
        return User.USER.UID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field2() {
        return User.USER.NAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Gender> field3() {
        return User.USER.GENDER;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component1() {
        return getUid();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component2() {
        return getName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Gender component3() {
        return getGender();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value1() {
        return getUid();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value2() {
        return getName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Gender value3() {
        return getGender();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UserRecord value1(Integer value) {
        setUid(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UserRecord value2(String value) {
        setName(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UserRecord value3(Gender value) {
        setGender(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UserRecord values(Integer value1, String value2, Gender value3) {
        value1(value1);
        value2(value2);
        value3(value3);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached UserRecord
     */
    public UserRecord() {
        super(User.USER);
    }

    /**
     * Create a detached, initialised UserRecord
     */
    public UserRecord(Integer uid, String name, Gender gender) {
        super(User.USER);

        set(0, uid);
        set(1, name);
        set(2, gender);
    }
}
