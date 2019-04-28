/**
 * 1. Module is the named collection of Code and data
 * 2. Was first introduced in Jdk9
 * 3. Module can contain java code that is organized as set of packages. Each package 
 * can contain classes , interfaces and so on.
 * 4. Module can be considered as the CONTAINER of packages
 * 5. Every module needs to have some configuration:
 * 		a) name: unique name of the module
 * 		b) inputs: what the module needs to use and what is required for the module to
 *         compile and run
 *      c) outputs: What the module outputs or exports to other module.
 * 6. Java SE9 is divided into a set of modules that are known as "Platform Modules".
 *    This provides a scalable runtime.
 *    Standard modules have name prefixed with java. Example: java.base , java.sql etc 
 * 7. Every module comes with a 'Module- Descriptor file' that describes module and contains 
 *    metadata about the module.
 *    The module descriptor file is directly located under the root folder, and always
 *    has the name "module-info.java".
 * 
 * 8. Module Declaration:
 *    ====================
 *    a) Module Declaration introduces a module name that can be used in other module
 *    	 module declarations to express relationships between module.
 *    b) A module name consists of one or more java identifiers separated by "." tokens.
 *    c) There are two kinds of modules : NORMAL MODULES and OPEN MODULES.
 *    	 The kind of Module determines access to the module's types, and the members of 
 *    	 those types, for code outside the modules
 *    d) NORMAL MODULE:
 *       =============
 *       A NORMAL MODULE without the open modifier , grants access to compile time and 
 *       run time to types in only those packages that are explicitlty  exported.
 *    e) OPEN MODULE:
 *       ===========
 *       An Open Module with an open identifier, grants access at COMPILE time to only
 *       those packages which are explicitly exported, but grants access at RUNTIME to
 *       types in all its packages, as if all packages have been exported.
 * 
 * 9. Its good practice to name modules with the same name as packages
 * 
 * 10. Types of module statements:
 * 		a) exports statement:
 * 			An Export Statement  is used to specify PACKAGES that are exported by the current
 * 			module.
 * 		b) opens statement:
 * 			Keep in Mind . Open Statements can't be used in OPEN packages as all packages are 
 * 			open in an open module.
 * 		c) requires statement:
 * 			The required statement is required to specify the module that is required by
 * 			the current module. In other words, if our module depends on some other module
 * 			we have to specify it using requires statement.
 * 			Multiple requires statement can be written depending upon how mnay modules are required
 *          by the current module.
 * 		d) uses statements:
 *          An uses statement is used to specify the SERVICE the current module consumes
 * 		e) provides statements:
 *          A provides statement is used to specify the SERVICE IMPLEMENTATION that current module provides
 */
/**
 * @author amrit
 *
 */
module dataStructureAndAlgos {
}