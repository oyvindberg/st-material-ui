package com.olvind.mui.muiJoy.anon

import slinky.core.facade.ReactElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `1`[D /* <: ReactElement */] extends StObject {
  
  var component: js.UndefOr[D] = js.undefined
}
object `1` {
  
  inline def apply[D /* <: ReactElement */](): `1`[D] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`1`[D]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `1`[?], D /* <: ReactElement */] (val x: Self & `1`[D]) extends AnyVal {
    
    inline def setComponent(value: D): Self = StObject.set(x, "component", value.asInstanceOf[js.Any])
    
    inline def setComponentUndefined: Self = StObject.set(x, "component", js.undefined)
  }
}
