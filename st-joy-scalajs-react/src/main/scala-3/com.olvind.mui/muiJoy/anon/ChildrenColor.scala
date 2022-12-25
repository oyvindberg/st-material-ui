package com.olvind.mui.muiJoy.anon

import com.olvind.mui.muiJoy.avatarAvatarPropsMod.AvatarPropsColorOverrides
import com.olvind.mui.muiJoy.avatarAvatarPropsMod.AvatarPropsSizeOverrides
import com.olvind.mui.muiJoy.avatarAvatarPropsMod.AvatarPropsVariantOverrides
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

trait ChildrenColor extends StObject {
  
  /**
    * Used to render icon or text elements inside the AvatarGroup if `src` is not set.
    * This can be an element, or just a string.
    */
  var children: js.UndefOr[Node] = js.undefined
  
  /**
    * The color context for the avatar children.
    * It has no effect on the AvatarGroup.
    */
  var color: js.UndefOr[OverridableStringUnion[ColorPaletteProp, AvatarPropsColorOverrides]] = js.undefined
  
  /**
    * The size of the component and the avatar children.
    * @default 'md'
    */
  var size: js.UndefOr[OverridableStringUnion["sm" | "md" | "lg", AvatarPropsSizeOverrides]] = js.undefined
  
  /**
    * The system prop that allows defining system overrides as well as additional CSS styles.
    */
  var sx: js.UndefOr[SxProps] = js.undefined
  
  /**
    * The variant context for the avatar children.
    * It has no effect on the AvatarGroup.
    */
  var variant: js.UndefOr[OverridableStringUnion[VariantProp, AvatarPropsVariantOverrides]] = js.undefined
}
object ChildrenColor {
  
  inline def apply(): ChildrenColor = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ChildrenColor]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ChildrenColor] (val x: Self) extends AnyVal {
    
    inline def setChildren(value: VdomNode): Self = StObject.set(x, "children", value.rawNode.asInstanceOf[js.Any])
    
    inline def setChildrenNull: Self = StObject.set(x, "children", null)
    
    inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
    
    inline def setChildrenVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "children", js.Array(value*))
    
    inline def setChildrenVdomElement(value: VdomElement): Self = StObject.set(x, "children", value.rawElement.asInstanceOf[js.Any])
    
    inline def setColor(value: OverridableStringUnion[ColorPaletteProp, AvatarPropsColorOverrides]): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
    
    inline def setSize(value: OverridableStringUnion["sm" | "md" | "lg", AvatarPropsSizeOverrides]): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    
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
    
    inline def setVariant(value: OverridableStringUnion[VariantProp, AvatarPropsVariantOverrides]): Self = StObject.set(x, "variant", value.asInstanceOf[js.Any])
    
    inline def setVariantUndefined: Self = StObject.set(x, "variant", js.undefined)
  }
}
