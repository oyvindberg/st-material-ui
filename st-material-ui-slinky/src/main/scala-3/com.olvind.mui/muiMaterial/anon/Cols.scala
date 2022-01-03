package com.olvind.mui.muiMaterial.anon

import com.olvind.mui.muiMaterial.muiMaterialStrings.auto
import com.olvind.mui.muiMaterial.muiMaterialStrings.masonry
import com.olvind.mui.muiMaterial.muiMaterialStrings.quilted
import com.olvind.mui.muiMaterial.muiMaterialStrings.standard
import com.olvind.mui.muiMaterial.muiMaterialStrings.woven
import com.olvind.mui.muiSystem.styleFunctionSxStyleFunctionSxMod.SxProps
import com.olvind.mui.muiSystem.styleFunctionSxStyleFunctionSxMod.SystemStyleObject
import com.olvind.mui.react.mod.ReactPortal
import slinky.core.facade.ReactElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Cols extends StObject {
  
  /**
    * The content of the component, normally `ImageListItem`s.
    */
  var children: ReactElement | String | Double | Any | ReactPortal | Boolean
  
  /**
    * Override or extend the styles applied to the component.
    */
  var classes: js.UndefOr[PartialImageListClasses] = js.undefined
  
  /**
    * Number of columns.
    * @default 2
    */
  var cols: js.UndefOr[Double] = js.undefined
  
  /**
    * The gap between items in px.
    * @default 4
    */
  var gap: js.UndefOr[Double] = js.undefined
  
  /**
    * The height of one row in px.
    * @default 'auto'
    */
  var rowHeight: js.UndefOr[Double | auto] = js.undefined
  
  /**
    * The system prop that allows defining system overrides as well as additional CSS styles.
    */
  var sx: js.UndefOr[SxProps[com.olvind.mui.muiMaterial.createThemeMod.Theme]] = js.undefined
  
  /**
    * The variant to use.
    * @default 'standard'
    */
  var variant: js.UndefOr[masonry | quilted | standard | woven] = js.undefined
}
object Cols {
  
  inline def apply(children: ReactElement | String | Double | Any | ReactPortal | Boolean): Cols = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any])
    __obj.asInstanceOf[Cols]
  }
  
  extension [Self <: Cols](x: Self) {
    
    inline def setChildren(value: ReactElement | String | Double | Any | ReactPortal | Boolean): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    inline def setChildrenReactElement(value: ReactElement): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    inline def setClasses(value: PartialImageListClasses): Self = StObject.set(x, "classes", value.asInstanceOf[js.Any])
    
    inline def setClassesUndefined: Self = StObject.set(x, "classes", js.undefined)
    
    inline def setCols(value: Double): Self = StObject.set(x, "cols", value.asInstanceOf[js.Any])
    
    inline def setColsUndefined: Self = StObject.set(x, "cols", js.undefined)
    
    inline def setGap(value: Double): Self = StObject.set(x, "gap", value.asInstanceOf[js.Any])
    
    inline def setGapUndefined: Self = StObject.set(x, "gap", js.undefined)
    
    inline def setRowHeight(value: Double | auto): Self = StObject.set(x, "rowHeight", value.asInstanceOf[js.Any])
    
    inline def setRowHeightUndefined: Self = StObject.set(x, "rowHeight", js.undefined)
    
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
    
    inline def setVariant(value: masonry | quilted | standard | woven): Self = StObject.set(x, "variant", value.asInstanceOf[js.Any])
    
    inline def setVariantUndefined: Self = StObject.set(x, "variant", js.undefined)
  }
}
