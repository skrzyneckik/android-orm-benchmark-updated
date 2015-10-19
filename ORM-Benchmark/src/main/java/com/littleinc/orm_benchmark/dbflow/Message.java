package com.littleinc.orm_benchmark.dbflow;

import com.raizlabs.android.dbflow.annotation.Column;
import com.raizlabs.android.dbflow.annotation.ForeignKey;
import com.raizlabs.android.dbflow.annotation.ForeignKeyReference;
import com.raizlabs.android.dbflow.annotation.PrimaryKey;
import com.raizlabs.android.dbflow.annotation.Table;
import com.raizlabs.android.dbflow.structure.BaseModel;

/**
 * Created by kgalligan on 10/12/15.
 */
@Table(databaseName = DatabaseModule.NAME)
public class Message extends BaseModel
{
    @Column
    @PrimaryKey(autoincrement = true)
    public long mId;

    @Column
    public long mClientId;

    @Column
    public long mCommandId;

    @Column
    public double mSortedBy;

    @Column
    public int mCreatedAt;

    @Column
    public String mContent;

    @Column
    public long mSenderId;

    @Column
    public long mChannelId;

    @Column
    @ForeignKey(
            references = {@ForeignKeyReference(columnName = "user_id",
                    columnType = Long.class,
                    foreignColumnName = "mId")},

            saveForeignKeyModel = false)
    public User user;
}