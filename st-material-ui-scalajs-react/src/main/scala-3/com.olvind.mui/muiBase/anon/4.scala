package com.olvind.mui.muiBase.anon

import japgolly.scalajs.react.facade.React.ElementType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `4`[D /* <: ElementType */] extends StObject {
  
  var component: js.UndefOr[D] = js.undefined
}
object `4` {
  
  inline def apply[D /* <: ElementType */](): `4`[D] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`4`[D]]
  }
  
  extension [Self <: `4`[?], D /* <: ElementType */](x: Self & `4`[D]) {
    
    inline def setComponent(value: D): Self = StObject.set(x, "component", value.asInstanceOf[js.Any])
    
    inline def setComponentUndefined: Self = StObject.set(x, "component", js.undefined)
  }
}
