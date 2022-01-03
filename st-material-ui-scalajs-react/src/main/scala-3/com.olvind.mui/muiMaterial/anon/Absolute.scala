package com.olvind.mui.muiMaterial.anon

import com.olvind.mui.muiMaterial.muiMaterialStrings.center
import com.olvind.mui.muiMaterial.muiMaterialStrings.fullWidth
import com.olvind.mui.muiMaterial.muiMaterialStrings.horizontal
import com.olvind.mui.muiMaterial.muiMaterialStrings.inset
import com.olvind.mui.muiMaterial.muiMaterialStrings.left
import com.olvind.mui.muiMaterial.muiMaterialStrings.middle
import com.olvind.mui.muiMaterial.muiMaterialStrings.right
import com.olvind.mui.muiMaterial.muiMaterialStrings.vertical
import com.olvind.mui.muiSystem.styleFunctionSxStyleFunctionSxMod.SxProps
import com.olvind.mui.muiSystem.styleFunctionSxStyleFunctionSxMod.SystemStyleObject
import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Absolute extends StObject {
  
  /**
    * Absolutely position the element.
    * @default false
    */
  var absolute: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The content of the component.
    */
  var children: js.UndefOr[japgolly.scalajs.react.facade.React.Node] = js.undefined
  
  /**
    * Override or extend the styles applied to the component.
    */
  var classes: js.UndefOr[PartialDividerClasses] = js.undefined
  
  /**
    * If `true`, a vertical divider will have the correct height when used in flex container.
    * (By default, a vertical divider will have a calculated height of `0px` if it is the child of a flex container.)
    * @default false
    */
  var flexItem: js.UndefOr[Boolean] = js.undefined
  
  /**
    * If `true`, the divider will have a lighter color.
    * @default false
    */
  var light: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The component orientation.
    * @default 'horizontal'
    */
  var orientation: js.UndefOr[horizontal | vertical] = js.undefined
  
  /**
    * The system prop that allows defining system overrides as well as additional CSS styles.
    */
  var sx: js.UndefOr[SxProps[com.olvind.mui.muiMaterial.createThemeMod.Theme]] = js.undefined
  
  /**
    * The text alignment.
    * @default 'center'
    */
  var textAlign: js.UndefOr[center | right | left] = js.undefined
  
  /**
    * The variant to use.
    * @default 'fullWidth'
    */
  var variant: js.UndefOr[fullWidth | inset | middle] = js.undefined
}
object Absolute {
  
  inline def apply(): Absolute = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Absolute]
  }
  
  extension [Self <: Absolute](x: Self) {
    
    inline def setAbsolute(value: Boolean): Self = StObject.set(x, "absolute", value.asInstanceOf[js.Any])
    
    inline def setAbsoluteUndefined: Self = StObject.set(x, "absolute", js.undefined)
    
    inline def setChildren(value: VdomNode): Self = StObject.set(x, "children", value.rawNode.asInstanceOf[js.Any])
    
    inline def setChildrenNull: Self = StObject.set(x, "children", null)
    
    inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
    
    inline def setChildrenVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "children", js.Array(value*))
    
    inline def setChildrenVdomElement(value: VdomElement): Self = StObject.set(x, "children", value.rawElement.asInstanceOf[js.Any])
    
    inline def setClasses(value: PartialDividerClasses): Self = StObject.set(x, "classes", value.asInstanceOf[js.Any])
    
    inline def setClassesUndefined: Self = StObject.set(x, "classes", js.undefined)
    
    inline def setFlexItem(value: Boolean): Self = StObject.set(x, "flexItem", value.asInstanceOf[js.Any])
    
    inline def setFlexItemUndefined: Self = StObject.set(x, "flexItem", js.undefined)
    
    inline def setLight(value: Boolean): Self = StObject.set(x, "light", value.asInstanceOf[js.Any])
    
    inline def setLightUndefined: Self = StObject.set(x, "light", js.undefined)
    
    inline def setOrientation(value: horizontal | vertical): Self = StObject.set(x, "orientation", value.asInstanceOf[js.Any])
    
    inline def setOrientationUndefined: Self = StObject.set(x, "orientation", js.undefined)
    
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
    
    inline def setTextAlign(value: center | right | left): Self = StObject.set(x, "textAlign", value.asInstanceOf[js.Any])
    
    inline def setTextAlignUndefined: Self = StObject.set(x, "textAlign", js.undefined)
    
    inline def setVariant(value: fullWidth | inset | middle): Self = StObject.set(x, "variant", value.asInstanceOf[js.Any])
    
    inline def setVariantUndefined: Self = StObject.set(x, "variant", js.undefined)
  }
}
