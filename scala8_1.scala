
import scala.io.StdIn._
object CaesarCipher {
  
  // Function to encrypt a text using Caesar cipher
  def encrypt(text: String, shift: Int): String = {
    text.map { 
      case c if c.isLetter =>
        val base = if (c.isUpper) 'A' else 'a'
        ((c - base + shift) % 26 + base).toChar
      case c => c
    }
  }

  // Function to decrypt a text using Caesar cipher
  def decrypt(text: String, shift: Int): String = {
    text.map {
      case c if c.isLetter =>
        val base = if (c.isUpper) 'A' else 'a'
        ((c - base - shift + 26) % 26 + base).toChar
      case c => c
    }
  }

  // General cipher function to process data with the given function (encrypt or decrypt)
  def cipher(text: String, shift: Int, algo: (String, Int) => String): String = {
    algo(text, shift)
  }

  def main(args: Array[String]): Unit = {
    val plaintext = "Hello, World!"
    val shift = 3

    // Encrypt the plaintext
    val encryptedText = cipher(plaintext, shift, encrypt)
    println(s"Encrypted Text: $encryptedText")

    // Decrypt the ciphertext
    val decryptedText = cipher(encryptedText, shift, decrypt)
    println(s"Decrypted Text: $decryptedText")
  }
}
