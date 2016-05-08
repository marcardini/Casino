package dominio;

public class ComboItem {
    private Object object;
    private String value;

    public ComboItem(Object obj, String value) {
        this.object = obj;
        this.value = value;
    }

    public Object getObject() {
        return object;
    }

    public String getValue() {
        return value;
    }

    public void setObject(Object object) {
        this.object = object;
    }

    public void setValue(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        if(value.equals("0"))
            return object.toString() + " (ninguna partida elegible)";
        else if(value.equals("1"))
              return object.toString() + " (" + value + " partida en actividad)";
        else
            return object.toString() + " (" + value + " partidas en actividad)";
    }
}