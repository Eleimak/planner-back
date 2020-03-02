package tam.step.plannerback.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Priority {
    @Id
    private Long id;
}
