package com.olvind.mui.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ShadowRootInit extends StObject {
  
  /* standard dom */
  var delegatesFocus: js.UndefOr[Boolean] = js.undefined
  
  /* standard dom */
  var mode: ShadowRootMode
}
object ShadowRootInit {
  
  inline def apply(mode: ShadowRootMode): ShadowRootInit = {
    val __obj = js.Dynamic.literal(mode = mode.asInstanceOf[js.Any])
    __obj.asInstanceOf[ShadowRootInit]
  }
  
  extension [Self <: ShadowRootInit](x: Self) {
    
    inline def setDelegatesFocus(value: Boolean): Self = StObject.set(x, "delegatesFocus", value.asInstanceOf[js.Any])
    
    inline def setDelegatesFocusUndefined: Self = StObject.set(x, "delegatesFocus", js.undefined)
    
    inline def setMode(value: ShadowRootMode): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
  }
}
