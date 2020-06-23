<h1>Securing Java EE Applications</h1>

<h2>Declarative Security</h2>
- The web.xml (or jboss-web.xml) file defines which resources in an application should be secured. <br>

Security annotations: <br>

<h4>@SecurityDomain</h4>
- Located at the beginning of the class.
- This annotation defines the security domain by name to use for the EJB. 
<h4>@DeclareRoles</h4>
- Located in the beginning of the class.
- Defines the roles that are tested for permissions in the class. 
- If this annotation is not used, the roles are checked based on the presence of the @RolesAllowed annotations.  
<h4>@RolesAllowed</h4>
- Located either at the beginning of the class or before a method header. 
- Defines a list of one or more roles allowed to access a method. 
<h4>@PermitAll</h4>
- This annotation specifies that all roles are allowed to access a method. 
<h4>@DenyAll</h4>
- This annotation specifies that no roles are allowed to access a method. 
<h4>@RunAs</h4>
- This annotation specifies the role used when running a method. 

<br>
<h2>Securing a REST API</h2>
- To enable REST Security we update the web.xml to contain "<"context-param">".

<h3>RESTEasy Annotations</h3>

<h4>@RolesAllowed</h4>
Defines the role or roles that can access a method.

<h4>@PermitAll</h4>
All roles defined in the web.xml can access the method. 

<h4>@DenyAll</h4>
Denies access to all roles to the method.

