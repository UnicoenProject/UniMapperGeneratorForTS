/*
 * generated by Xtext 2.13.0
 */
package net.unicoen


/**
 * Initialization support for running Xtext languages without Equinox extension registry.
 */
class UniMapperGeneratorStandaloneSetup extends UniMapperGeneratorStandaloneSetupGenerated {

	def static void doSetup() {
		new UniMapperGeneratorStandaloneSetup().createInjectorAndDoEMFRegistration()
	}
}
