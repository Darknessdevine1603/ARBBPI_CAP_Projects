package cds.gen.catalogservice;

import com.sap.cds.ql.CdsName;
import com.sap.cds.services.cds.ApplicationService;
import com.sap.cds.services.cds.CqnService;
import com.sap.cds.services.cds.RemoteService;
import javax.annotation.processing.Generated;

@Generated(
    value = "cds-maven-plugin",
    date = "2024-04-03T09:42:00.075435284Z",
    comments = "com.sap.cds:cds-maven-plugin:2.7.0 / com.sap.cds:cds4j-api:2.7.0"
)
@CdsName(CatalogService_.CDS_NAME)
public interface CatalogService extends CqnService {
  interface Application extends ApplicationService, CatalogService {
  }

  interface Remote extends RemoteService, CatalogService {
  }
}
