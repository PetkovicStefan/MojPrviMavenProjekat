package data.models.reqres;

import java.io.Serializable;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import data.models.common.Data;
import data.models.common.Support;

public class UserResponse implements Serializable
{

    @SerializedName("data")
    @Expose
    private Data data;
    @SerializedName("support")
    @Expose
    private Support support;
    private final static long serialVersionUID = -127919493111925438L;

    public UserResponse() {
    }

    public UserResponse(Data data, Support support) {
        super();
        this.data = data;
        this.support = support;
    }

    public Data getData() {
        return data;
    }

    public void setData(Data data) {
        this.data = data;
    }

    public Support getSupport() {
        return support;
    }

    public void setSupport(Support support) {
        this.support = support;
    }

}
