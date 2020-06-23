# Context and Dependency Injection

<h1>Dependency Injection</h1>
An example of this can be found in the 'Dependency-injection' folder. <br>
To be able to perform a dependency injection we need to add: <b>beans.xml</b> in our WEB-INF directory <br>

If we then have an EmailValidator class, we don't need to do anything to it. By usin CDI we can inject it anywhere in the following way: <br>

@Inject <br>
Private EmailValidator emailValidator;<br><br>

<h2>Qualifier</h2>
An qualifier is how we create our own anotation which can be added as extra information above @inject to specify what it is that we are injecting. <br>
An example can be found here: <br>
<a href="https://github.com/KristoferMar/Java-Guide/tree/master/Context-Dependency-Injection/Dependency-Injection
" target="_blank">https://github.com/KristoferMar/Java-Guide/tree/master/Context-Dependency-Injection/Dependency-Injection</a><br>

<h1>Contexts </h1>

We have 5 scopes <br>

<h3>Application Scope </h3>
Create when the application starts, and destroyed when the application ends. <br>
- @ApplicationScope <br>

<h3>Session Scope</h3>
Lives for the length of time which you user is interacting with the application <br>
- @SessionScope

<h3>Conversation Scope</h3>
Spans though multiple requests but spans shorter tahn a session. <br>
- This is like a shopping cart, you can add items and pay which ends the scope but you will still be logged into the app (session scope.). <br>
- You get to start and end the conversation on by yourself the developer. <br>
- @ConversationScope

<h3>Dependent Scope</h3>
Is a default for all beans within a CDI.
- Does not have a scope becuase it is the default for everytihing which does not have an annotation. <br>

<h3>Request Scope</h3>
A Single request from the user to the server and then back again. Only serves a single request before destruction. <br>

<br>
<h2>Annotations</h2>

<h4>@Stateless</h4>
- Makes you able to only create one living instance of something <br>

<h4>@Named</h4>
- Make it avaialbe for other UI Lanagages which support expression language and which is not java code. <br>
- If we create annotate @Named("name") the Name EJB will be usable in expression languages as "name.whatEverInsideEJB".<br>
