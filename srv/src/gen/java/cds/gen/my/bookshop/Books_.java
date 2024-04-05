package cds.gen.my.bookshop;

import com.sap.cds.ql.CdsName;
import com.sap.cds.ql.ElementRef;
import com.sap.cds.ql.StructuredType;
import java.lang.Integer;
import java.lang.String;
import javax.annotation.processing.Generated;

@CdsName("my.bookshop.Books")
@Generated(
    value = "cds-maven-plugin",
    date = "2024-04-03T09:42:00.075435284Z",
    comments = "com.sap.cds:cds-maven-plugin:2.7.0 / com.sap.cds:cds4j-api:2.7.0"
)
public interface Books_ extends StructuredType<Books_> {
  String CDS_NAME = "my.bookshop.Books";

  ElementRef<Integer> ID();

  ElementRef<String> title();

  ElementRef<Integer> stock();
}
