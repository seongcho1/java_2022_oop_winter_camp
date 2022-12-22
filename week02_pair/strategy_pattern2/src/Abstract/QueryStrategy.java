package Abstract;

import Interface.DeleteQuery;
import Interface.InsertQuery;
import Interface.UpdateQuery;

import java.util.Arrays;

public abstract class QueryStrategy implements DeleteQuery, InsertQuery, UpdateQuery {
    public boolean isInjectAttack(String source, String[] filter) {
        var array = source.split(" ");
        return Arrays.stream(array).filter(e -> subInjectAttack(e, filter)).parallel().findAny().orElse(null) != null;
    }

    private boolean subInjectAttack(String source, String[] filter) {
        return Arrays.stream(filter).filter(e -> e.equalsIgnoreCase(source.toLowerCase())).parallel().findAny().orElse(null) != null;
    }

    public abstract String getDatabase();

    public abstract String toString();
}
