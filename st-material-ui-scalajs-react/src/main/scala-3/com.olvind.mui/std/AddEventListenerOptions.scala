package com.olvind.mui.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/////////////////////////////
/// DOM APIs
/////////////////////////////
trait AddEventListenerOptions
  extends StObject
     with EventListenerOptions {
  
  /* standard dom */
  var once: js.UndefOr[Boolean] = js.undefined
  
  /* standard dom */
  var passive: js.UndefOr[Boolean] = js.undefined
}
object AddEventListenerOptions {
  
  inline def apply(): AddEventListenerOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AddEventListenerOptions]
  }
  
  extension [Self <: AddEventListenerOptions](x: Self) {
    
    inline def setOnce(value: Boolean): Self = StObject.set(x, "once", value.asInstanceOf[js.Any])
    
    inline def setOnceUndefined: Self = StObject.set(x, "once", js.undefined)
    
    inline def setPassive(value: Boolean): Self = StObject.set(x, "passive", value.asInstanceOf[js.Any])
    
    inline def setPassiveUndefined: Self = StObject.set(x, "passive", js.undefined)
  }
}
