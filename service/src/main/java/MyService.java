import java.util.UUID;

public class MyService {
    private final DbSetting dbSetting = new DbSetting("name", "password");
    private final String name = "myService";
    private final Db db = new Db(dbSetting);


    public MyEntity setMyEntity(MyEntity myEntity) {
        myEntity.setId(UUID.randomUUID());
        db.setMyEntity(myEntity);
        return myEntity;
    }

    public String getName() {
        return name;
    }

    public MyEntity getMyEntity() {
        return db.getMyEntity();
    }
}