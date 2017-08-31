package at.rovo.awsxray.domain.entities;

import org.bson.types.ObjectId;

public interface DomainObject {
    ObjectId getId();

    String getUuid();
}
