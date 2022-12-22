package QueryBuilder;

import Abstract.QueryStrategy;
import Entity.UserInfo;

final public class QueryBuilder extends QueryStrategy {
    private QueryStrategy queryStrategy;

    public QueryBuilder(QueryStrategy queryStrategy) { this.queryStrategy = queryStrategy; }

    public void setStrategy(QueryStrategy queryStrategy) { this.queryStrategy = queryStrategy; }
    public QueryStrategy getStrategy() { return this.queryStrategy; }

    @Override
    public String getDatabase() { return queryStrategy.getDatabase(); }

    @Override
    public String deleteUser(UserInfo userInfo) { return queryStrategy.deleteUser(userInfo); }

    @Override
    public String insertUser(UserInfo userInfo) { return queryStrategy.insertUser(userInfo); }

    @Override
    public String updateUser(UserInfo userInfo) { return queryStrategy.updateUser(userInfo); }

    @Override
    public String toString() { return getDatabase(); }
}
