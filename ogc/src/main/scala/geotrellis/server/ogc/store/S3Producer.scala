package geotrellis.server.ogc.store

import geotrellis.store.s3.S3AttributeStore
import software.amazon.awssdk.auth.credentials.{AwsBasicCredentials, StaticCredentialsProvider}
import software.amazon.awssdk.regions.Region
import software.amazon.awssdk.services.s3.S3Client

import java.net.URI

/**
 * @Description
 * @author hexiaoliang
 * @version 1.0.0
 * @date 2023-04-10 19:53:00
 */
object S3Producer extends Serializable {

  def apply(): S3Client = {
    val cred = AwsBasicCredentials.create("Minio", "Ahxiedooc!ae5Am4")
    val credProvider = StaticCredentialsProvider.create(cred)
    val url = new URI("http://10.7.18.106:9000")
    S3Client.builder()
      .endpointOverride(url)
      .credentialsProvider(credProvider)
      .region(Region.US_EAST_1)
      .build()
  }
}