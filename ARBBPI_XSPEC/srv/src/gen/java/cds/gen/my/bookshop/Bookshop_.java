package cds.gen.my.bookshop;

import com.sap.cds.ql.CdsName;
import java.lang.Class;
import java.lang.String;
import javax.annotation.processing.Generated;

@Generated(
    value = "cds-maven-plugin",
    date = "2024-04-04T07:54:39.491324Z",
    comments = "com.sap.cds:cds-maven-plugin:2.7.0 / com.sap.cds:cds4j-api:2.7.0"
)
@CdsName("my.bookshop")
public interface Bookshop_ {
  String CDS_NAME = "my.bookshop";

  Class<Books_> BOOKS = Books_.class;
}
