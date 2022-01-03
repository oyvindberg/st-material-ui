package com.olvind.mui.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/////////////////////////////
/// ECMAScript Internationalization API
/////////////////////////////
object Intl {
  
  trait CollatorOptions extends StObject {
    
    /* standard es5 */
    var caseFirst: js.UndefOr[java.lang.String] = js.undefined
    
    /* standard es5 */
    var ignorePunctuation: js.UndefOr[Boolean] = js.undefined
    
    /* standard es5 */
    var localeMatcher: js.UndefOr[java.lang.String] = js.undefined
    
    /* standard es5 */
    var numeric: js.UndefOr[Boolean] = js.undefined
    
    /* standard es5 */
    var sensitivity: js.UndefOr[java.lang.String] = js.undefined
    
    /* standard es5 */
    var usage: js.UndefOr[java.lang.String] = js.undefined
  }
  object CollatorOptions {
    
    inline def apply(): CollatorOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CollatorOptions]
    }
    
    extension [Self <: CollatorOptions](x: Self) {
      
      inline def setCaseFirst(value: java.lang.String): Self = StObject.set(x, "caseFirst", value.asInstanceOf[js.Any])
      
      inline def setCaseFirstUndefined: Self = StObject.set(x, "caseFirst", js.undefined)
      
      inline def setIgnorePunctuation(value: Boolean): Self = StObject.set(x, "ignorePunctuation", value.asInstanceOf[js.Any])
      
      inline def setIgnorePunctuationUndefined: Self = StObject.set(x, "ignorePunctuation", js.undefined)
      
      inline def setLocaleMatcher(value: java.lang.String): Self = StObject.set(x, "localeMatcher", value.asInstanceOf[js.Any])
      
      inline def setLocaleMatcherUndefined: Self = StObject.set(x, "localeMatcher", js.undefined)
      
      inline def setNumeric(value: Boolean): Self = StObject.set(x, "numeric", value.asInstanceOf[js.Any])
      
      inline def setNumericUndefined: Self = StObject.set(x, "numeric", js.undefined)
      
      inline def setSensitivity(value: java.lang.String): Self = StObject.set(x, "sensitivity", value.asInstanceOf[js.Any])
      
      inline def setSensitivityUndefined: Self = StObject.set(x, "sensitivity", js.undefined)
      
      inline def setUsage(value: java.lang.String): Self = StObject.set(x, "usage", value.asInstanceOf[js.Any])
      
      inline def setUsageUndefined: Self = StObject.set(x, "usage", js.undefined)
    }
  }
}
