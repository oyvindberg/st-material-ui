package com.olvind.mui.muiMaterial.anon

import com.olvind.mui.muiMaterial.muiMaterialStrings.dense
import com.olvind.mui.muiMaterial.muiMaterialStrings.regular
import com.olvind.mui.muiSystem.styleFunctionSxStyleFunctionSxMod.SxProps
import com.olvind.mui.muiSystem.styleFunctionSxStyleFunctionSxMod.SystemStyleObject
import slinky.core.facade.ReactElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Variant extends StObject {
  
  /**
    * The Toolbar children, usually a mixture of `IconButton`, `Button` and `Typography`.
    * The Toolbar is a flex container, allowing flex item properites to be used to lay out the children.
    */
  var children: js.UndefOr[ReactElement] = js.undefined
  
  /**
    * Override or extend the styles applied to the component.
    */
  var classes: js.UndefOr[PartialToolbarClasses] = js.undefined
  
  /**
    * If `true`, disables gutter padding.
    * @default false
    */
  var disableGutters: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The system prop that allows defining system overrides as well as additional CSS styles.
    */
  var sx: js.UndefOr[SxProps[com.olvind.mui.muiMaterial.createThemeMod.Theme]] = js.undefined
  
  /**
    * The variant to use.
    * @default 'regular'
    */
  var variant: js.UndefOr[regular | dense] = js.undefined
}
object Variant {
  
  inline def apply(): Variant = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Variant]
  }
  
  extension [Self <: Variant](x: Self) {
    
    inline def setChildren(value: ReactElement): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
    
    inline def setClasses(value: PartialToolbarClasses): Self = StObject.set(x, "classes", value.asInstanceOf[js.Any])
    
    inline def setClassesUndefined: Self = StObject.set(x, "classes", js.undefined)
    
    inline def setDisableGutters(value: Boolean): Self = StObject.set(x, "disableGutters", value.asInstanceOf[js.Any])
    
    inline def setDisableGuttersUndefined: Self = StObject.set(x, "disableGutters", js.undefined)
    
    inline def setSx(value: SxProps[com.olvind.mui.muiMaterial.createThemeMod.Theme]): Self = StObject.set(x, "sx", value.asInstanceOf[js.Any])
    
    inline def setSxFunction1(
      value: com.olvind.mui.muiMaterial.createThemeMod.Theme => SystemStyleObject[com.olvind.mui.muiMaterial.createThemeMod.Theme]
    ): Self = StObject.set(x, "sx", js.Any.fromFunction1(value))
    
    inline def setSxNull: Self = StObject.set(x, "sx", null)
    
    inline def setSxUndefined: Self = StObject.set(x, "sx", js.undefined)
    
    inline def setSxVarargs(
      value: (Boolean | SystemStyleObject[com.olvind.mui.muiMaterial.createThemeMod.Theme] | (js.Function1[
          com.olvind.mui.muiMaterial.createThemeMod.Theme, 
          SystemStyleObject[com.olvind.mui.muiMaterial.createThemeMod.Theme]
        ]))*
    ): Self = StObject.set(x, "sx", js.Array(value*))
    
    inline def setVariant(value: regular | dense): Self = StObject.set(x, "variant", value.asInstanceOf[js.Any])
    
    inline def setVariantUndefined: Self = StObject.set(x, "variant", js.undefined)
  }
}
