package com.olvind.mui.muiBase.anon

import slinky.core.facade.ReactElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `4`[D /* <: ReactElement */] extends StObject {
  
  var component: js.UndefOr[D] = js.undefined
}
object `4` {
  
  inline def apply[D /* <: ReactElement */](): `4`[D] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`4`[D]]
  }
  
  extension [Self <: `4`[?], D /* <: ReactElement */](x: Self & `4`[D]) {
    
    inline def setComponent(value: D): Self = StObject.set(x, "component", value.asInstanceOf[js.Any])
    
    inline def setComponentUndefined: Self = StObject.set(x, "component", js.undefined)
  }
}
