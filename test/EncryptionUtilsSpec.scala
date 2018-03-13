import org.scalatestplus.play._
import util.EncryptionUtils

class EncryptionUtilsSpec extends PlaySpec {

  "EncryptionUtils" should {
    "encrpt and decrypt password" in {
      val value = "somePassword123$"
      val encryptedValue = EncryptionUtils.encrypt(value)
      val decryptValue = EncryptionUtils.decrypt(encryptedValue)
      decryptValue mustBe value
    }
  }

}
