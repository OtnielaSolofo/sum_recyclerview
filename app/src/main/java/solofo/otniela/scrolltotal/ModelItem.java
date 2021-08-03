package solofo.otniela.scrolltotal;

import android.os.Parcel;
import android.os.Parcelable;

public class ModelItem implements Parcelable {

    public int id;

    protected ModelItem(Parcel in) {
        id = in.readInt();
        texteDescription = in.readString();
    }

    public static final Creator<ModelItem> CREATOR = new Creator<ModelItem>() {
        @Override
        public ModelItem createFromParcel(Parcel in) {
            return new ModelItem(in);
        }

        @Override
        public ModelItem[] newArray(int size) {
            return new ModelItem[size];
        }
    };

    public int getId() {
        return id;
    }

    public ModelItem() {

    }

    public ModelItem(int id , String texteDescription) {

        this.id = id;
        this.texteDescription = texteDescription;

    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTexteDescription() {
        return texteDescription;
    }

    public void setTexteDescription(String texteDescription) {
        this.texteDescription = texteDescription;
    }

    public String texteDescription;

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeInt(id);
        dest.writeString(texteDescription);
    }
}
