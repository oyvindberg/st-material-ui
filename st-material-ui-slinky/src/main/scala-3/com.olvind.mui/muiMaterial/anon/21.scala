package com.olvind.mui.muiMaterial.anon

import slinky.core.facade.ReactElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `21`[PrimaryTypographyComponent /* <: ReactElement */] extends StObject {
  
  var component: js.UndefOr[PrimaryTypographyComponent] = js.undefined
}
object `21` {
  
  inline def apply[PrimaryTypographyComponent /* <: ReactElement */](): `21`[PrimaryTypographyComponent] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`21`[PrimaryTypographyComponent]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `21`[?], PrimaryTypographyComponent /* <: ReactElement */] (val x: Self & `21`[PrimaryTypographyComponent]) extends AnyVal {
    
    inline def setComponent(value: PrimaryTypographyComponent): Self = StObject.set(x, "component", value.asInstanceOf[js.Any])
    
    inline def setComponentUndefined: Self = StObject.set(x, "component", js.undefined)
  }
}
