import kotlinx.coroutines.*
import org.junit.jupiter.api.Test
import java.util.Date
import kotlin.concurrent.thread

class Coroutiness{
    suspend fun helloWorld(){
        println("Hello World: ${Date()}")
        delay(2000)
        println("Hello World: ${Date()}")
    }

    @Test
    fun SuspendFunc(){
        runBlocking{
            helloWorld()
            /*
            Output:
            Hello World
            delay 2s
            Hello World
             */
        }
    }


}

class CoroutinesTest{
    suspend fun hello(){
        delay(1000)
        println("Hello Coroutines")
    }

    @Test
    fun testhello(){
        GlobalScope.launch {
            hello()
        }
        /*Use runBlocking so globalScope can run,
        because GlobalScope run in Async.
        The hello() has a delay 1sec, so the launch already ended before it can run
         */
        println("Waiting")
        runBlocking {
            delay(2000)
        }
        println("Success")
    }

    //Job//

    //Starting Job//
    @Test
    fun testJobLazy(){
        runBlocking {
            val job: Job = GlobalScope.launch {
                delay(2000)
                println("Coroutines Done")
            }
            job.start()
            delay(3000)
        }
    }
    //Waiting job//
    @Test
    fun testJobJoin(){
        runBlocking {
            val job: Job = GlobalScope.launch {
                delay(2000)
                println("Coroutines Done")
            }
            job.join()
        }
    }
    //Canceling Job//
    @Test
    fun testJobCancel(){
        runBlocking {
            val job: Job = GlobalScope.launch {
                delay(2000)
                println("Coroutines Done")
            }
            job.cancel()
            delay(3000)
        }
    }
}

