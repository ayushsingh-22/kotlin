fun main(){
    val task = taskmanager(bgtask("task1"), bgexecute("task1"))
    task.create()  
    task.execute()

}

interface taskcreate{
    fun create()
}

interface taskexecute{

    fun execute()
}

class bgtask(val taskname: String) : taskcreate{

    override fun create() { 
        println("Task: $taskname created!!! ")
    }
}

class bgexecute(val taskname: String) : taskexecute{

    override fun execute() { 
        println("Task: $taskname executed.... ")
    }
}

/*
class taskmanager(val creator: taskcreate, val executor: taskexecute)
        :taskcreate, taskexecute{

    override fun create() { 
         creator.create()
    }

    override fun execute() {
        executor.execute()
     }
 */

 // Delegation Function

class taskmanager(val creator: taskcreate, val executor: taskexecute)
        :taskcreate by creator, taskexecute by executor