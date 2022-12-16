package com.olvind.mui.muiMaterial.anon

import com.olvind.mui.muiMaterial.stylesMod.ClassNameMap
import slinky.core.facade.ReactElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<@mui/material.@mui/material/CssBaseline.CssBaselineProps> */
trait PartialCssBaselineProps extends StObject {
  
  var children: js.UndefOr[ReactElement] = js.undefined
  
  var classes: js.UndefOr[com.olvind.mui.std.Partial[ClassNameMap[scala.Nothing]]] = js.undefined
  
  var enableColorScheme: js.UndefOr[Boolean] = js.undefined
}
object PartialCssBaselineProps {
  
  inline def apply(): PartialCssBaselineProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialCssBaselineProps]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PartialCssBaselineProps] (val x: Self) extends AnyVal {
    
    inline def setChildren(value: ReactElement): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
    
    inline def setClasses(value: com.olvind.mui.std.Partial[ClassNameMap[scala.Nothing]]): Self = StObject.set(x, "classes", value.asInstanceOf[js.Any])
    
    inline def setClassesUndefined: Self = StObject.set(x, "classes", js.undefined)
    
    inline def setEnableColorScheme(value: Boolean): Self = StObject.set(x, "enableColorScheme", value.asInstanceOf[js.Any])
    
    inline def setEnableColorSchemeUndefined: Self = StObject.set(x, "enableColorScheme", js.undefined)
  }
}
