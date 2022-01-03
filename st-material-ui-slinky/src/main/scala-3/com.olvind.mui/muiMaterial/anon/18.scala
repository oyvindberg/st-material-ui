package com.olvind.mui.muiMaterial.anon

import slinky.core.facade.ReactElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `18`[PrimaryTypographyComponent /* <: ReactElement */] extends StObject {
  
  var component: js.UndefOr[PrimaryTypographyComponent] = js.undefined
}
object `18` {
  
  inline def apply[PrimaryTypographyComponent /* <: ReactElement */](): `18`[PrimaryTypographyComponent] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`18`[PrimaryTypographyComponent]]
  }
  
  extension [Self <: `18`[?], PrimaryTypographyComponent /* <: ReactElement */](x: Self & `18`[PrimaryTypographyComponent]) {
    
    inline def setComponent(value: PrimaryTypographyComponent): Self = StObject.set(x, "component", value.asInstanceOf[js.Any])
    
    inline def setComponentUndefined: Self = StObject.set(x, "component", js.undefined)
  }
}
