package compose.gpt

import com.xebia.functional.tokenizer.ModelType
import com.xebia.functional.xef.agents.scrapeUrlContent
import com.xebia.functional.xef.auto.ai
import com.xebia.functional.xef.auto.getOrThrow
import com.xebia.functional.xef.pdf.pdf
import com.xebia.functional.xef.textsplitters.TokenTextSplitter

val sourceUrls = listOf(
  "https://jorgecastillo.dev/book/",
  "https://developer.android.com/jetpack/compose",
)

val pdfs = listOf(
  "https://www.ebookfrenzy.com/pdf_previews/JetpackComposeEssentialsPreview.pdf",
)

suspend fun ComposeGPT() = ai {
  println("🤖 Starting ComposeGPT")
  val splitter = TokenTextSplitter(ModelType.GPT_3_5_TURBO, chunkSize = 400, chunkOverlap = 50)
  println( "🔎 Indexing urls")
  val urlDocs = sourceUrls.flatMap { scrapeUrlContent(it, splitter) }
  println( "🔎 Indexing pdfs")
  val pdfDocs = pdfs.flatMap { pdf(it, splitter) }
  println("🤖 Welcome to ComposeGPT")
  contextScope(urlDocs + pdfDocs) {
    while (true) {
      print("🤖 Enter a question: ")
      val question = readlnOrNull() ?: break
      println( "🔎 Generating answer")
      val answers = promptMessage(question) //default is gpt 3.5 turbo with 16k
      println( "🤖 Answer: ${answers.joinToString("\n") { it }}")
    }
  }
}

suspend fun main() =
  ComposeGPT().getOrThrow()
