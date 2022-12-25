package com.olvind.mui.muiJoy.anon

import com.olvind.mui.muiJoy.alertAlertPropsMod.AlertPropsColorOverrides
import com.olvind.mui.muiJoy.alertAlertPropsMod.AlertPropsSizeOverrides
import com.olvind.mui.muiJoy.alertAlertPropsMod.AlertPropsVariantOverrides
import com.olvind.mui.muiJoy.stylesTypesColorSystemMod.ColorPaletteProp
import com.olvind.mui.muiJoy.stylesTypesThemeMod.SxProps
import com.olvind.mui.muiJoy.stylesTypesVariantsMod.VariantProp
import com.olvind.mui.muiSystem.styleFunctionSxStyleFunctionSxMod.SystemStyleObject
import com.olvind.mui.muiTypes.mod.OverridableStringUnion
import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.facade.React.Node
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Color extends StObject {
  
  /**
    * The color of the component. It supports those theme colors that make sense for this component.
    * @default 'primary'
    */
  var color: js.UndefOr[OverridableStringUnion[ColorPaletteProp, AlertPropsColorOverrides]] = js.undefined
  
  /**
    * Element placed after the children.
    */
  var endDecorator: js.UndefOr[Node] = js.undefined
  
  /**
    * The ARIA role attribute of the element.
    * @default 'alert'
    */
  var role: js.UndefOr[String] = js.undefined
  
  /**
    * The size of the component.
    * @default 'md'
    */
  var size: js.UndefOr[OverridableStringUnion["sm" | "md" | "lg", AlertPropsSizeOverrides]] = js.undefined
  
  /**
    * Element placed before the children.
    */
  var startDecorator: js.UndefOr[Node] = js.undefined
  
  /**
    * The system prop that allows defining system overrides as well as additional CSS styles.
    */
  var sx: js.UndefOr[SxProps] = js.undefined
  
  /**
    * The variant to use.
    * @default 'soft'
    */
  var variant: js.UndefOr[OverridableStringUnion[VariantProp, AlertPropsVariantOverrides]] = js.undefined
}
object Color {
  
  inline def apply(): Color = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Color]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Color] (val x: Self) extends AnyVal {
    
    inline def setColor(value: OverridableStringUnion[ColorPaletteProp, AlertPropsColorOverrides]): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
    
    inline def setEndDecorator(value: VdomNode): Self = StObject.set(x, "endDecorator", value.rawNode.asInstanceOf[js.Any])
    
    inline def setEndDecoratorNull: Self = StObject.set(x, "endDecorator", null)
    
    inline def setEndDecoratorUndefined: Self = StObject.set(x, "endDecorator", js.undefined)
    
    inline def setEndDecoratorVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "endDecorator", js.Array(value*))
    
    inline def setEndDecoratorVdomElement(value: VdomElement): Self = StObject.set(x, "endDecorator", value.rawElement.asInstanceOf[js.Any])
    
    inline def setRole(value: String): Self = StObject.set(x, "role", value.asInstanceOf[js.Any])
    
    inline def setRoleUndefined: Self = StObject.set(x, "role", js.undefined)
    
    inline def setSize(value: OverridableStringUnion["sm" | "md" | "lg", AlertPropsSizeOverrides]): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    
    inline def setStartDecorator(value: VdomNode): Self = StObject.set(x, "startDecorator", value.rawNode.asInstanceOf[js.Any])
    
    inline def setStartDecoratorNull: Self = StObject.set(x, "startDecorator", null)
    
    inline def setStartDecoratorUndefined: Self = StObject.set(x, "startDecorator", js.undefined)
    
    inline def setStartDecoratorVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "startDecorator", js.Array(value*))
    
    inline def setStartDecoratorVdomElement(value: VdomElement): Self = StObject.set(x, "startDecorator", value.rawElement.asInstanceOf[js.Any])
    
    inline def setSx(value: SxProps): Self = StObject.set(x, "sx", value.asInstanceOf[js.Any])
    
    inline def setSxFunction1(
      value: com.olvind.mui.muiJoy.stylesTypesThemeMod.Theme => SystemStyleObject[com.olvind.mui.muiJoy.stylesTypesThemeMod.Theme]
    ): Self = StObject.set(x, "sx", js.Any.fromFunction1(value))
    
    inline def setSxNull: Self = StObject.set(x, "sx", null)
    
    inline def setSxUndefined: Self = StObject.set(x, "sx", js.undefined)
    
    inline def setSxVarargs(
      value: (Boolean | SystemStyleObject[com.olvind.mui.muiJoy.stylesTypesThemeMod.Theme] | (js.Function1[
          com.olvind.mui.muiJoy.stylesTypesThemeMod.Theme, 
          SystemStyleObject[com.olvind.mui.muiJoy.stylesTypesThemeMod.Theme]
        ]))*
    ): Self = StObject.set(x, "sx", js.Array(value*))
    
    inline def setVariant(value: OverridableStringUnion[VariantProp, AlertPropsVariantOverrides]): Self = StObject.set(x, "variant", value.asInstanceOf[js.Any])
    
    inline def setVariantUndefined: Self = StObject.set(x, "variant", js.undefined)
  }
}
