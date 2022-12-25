package com.olvind.mui.muiJoy.anon

import com.olvind.mui.muiJoy.linkLinkPropsMod.LinkPropsColorOverrides
import com.olvind.mui.muiJoy.linkLinkPropsMod.LinkPropsVariantOverrides
import com.olvind.mui.muiJoy.stylesTypesColorSystemMod.ColorPaletteProp
import com.olvind.mui.muiJoy.stylesTypesThemeMod.SxProps
import com.olvind.mui.muiJoy.stylesTypesVariantsMod.VariantProp
import com.olvind.mui.muiSystem.styleFunctionSxStyleFunctionSxMod.ResponsiveStyleValue
import com.olvind.mui.muiSystem.styleFunctionSxStyleFunctionSxMod.SystemStyleObject
import com.olvind.mui.muiTypes.mod.OverridableStringUnion
import com.olvind.mui.std.NonNullable
import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.facade.React.Node
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Level extends StObject {
  
  /**
    * The content of the component.
    */
  var children: js.UndefOr[Node] = js.undefined
  
  /**
    * The color of the link.
    * @default 'primary'
    */
  var color: js.UndefOr[OverridableStringUnion[ColorPaletteProp, LinkPropsColorOverrides]] = js.undefined
  
  /**
    * If `true`, the component is disabled.
    * @default false
    */
  var disabled: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Element placed after the children.
    */
  var endDecorator: js.UndefOr[Node] = js.undefined
  
  /**
    * Applies the theme typography styles.
    * @default 'body1'
    */
  var level: js.UndefOr[
    "body4" | "display2" | "body2" | "body5" | "h2" | "display1" | "h3" | "body1" | "h6" | "h1" | "h5" | "body3" | "h4" | "inherit"
  ] = js.undefined
  
  /**
    * If `true`, the ::after psuedo element is added to cover the area of interaction.
    * The parent of the overlay Link should have `relative` CSS position.
    * @default false
    */
  var overlay: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Element placed before the children.
    */
  var startDecorator: js.UndefOr[Node] = js.undefined
  
  /**
    * The system prop that allows defining system overrides as well as additional CSS styles.
    */
  var sx: js.UndefOr[SxProps] = js.undefined
  
  /**
    * The system color.
    */
  var textColor: js.UndefOr[
    (ResponsiveStyleValue[
      js.UndefOr[
        com.olvind.mui.csstype.mod.Property.Color | js.Array[NonNullable[js.UndefOr[com.olvind.mui.csstype.mod.Property.Color]]]
      ]
    ]) | (js.Function1[
      /* theme */ com.olvind.mui.muiJoy.stylesTypesThemeMod.Theme, 
      ResponsiveStyleValue[
        js.UndefOr[
          com.olvind.mui.csstype.mod.Property.Color | js.Array[NonNullable[js.UndefOr[com.olvind.mui.csstype.mod.Property.Color]]]
        ]
      ]
    ])
  ] = js.undefined
  
  /**
    * Controls when the link should have an underline.
    * @default 'hover'
    */
  var underline: js.UndefOr["none" | "hover" | "always"] = js.undefined
  
  /**
    * Applies the theme link styles.
    * @default 'plain'
    */
  var variant: js.UndefOr[OverridableStringUnion[VariantProp, LinkPropsVariantOverrides]] = js.undefined
}
object Level {
  
  inline def apply(): Level = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Level]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Level] (val x: Self) extends AnyVal {
    
    inline def setChildren(value: VdomNode): Self = StObject.set(x, "children", value.rawNode.asInstanceOf[js.Any])
    
    inline def setChildrenNull: Self = StObject.set(x, "children", null)
    
    inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
    
    inline def setChildrenVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "children", js.Array(value*))
    
    inline def setChildrenVdomElement(value: VdomElement): Self = StObject.set(x, "children", value.rawElement.asInstanceOf[js.Any])
    
    inline def setColor(value: OverridableStringUnion[ColorPaletteProp, LinkPropsColorOverrides]): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
    
    inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
    
    inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
    
    inline def setEndDecorator(value: VdomNode): Self = StObject.set(x, "endDecorator", value.rawNode.asInstanceOf[js.Any])
    
    inline def setEndDecoratorNull: Self = StObject.set(x, "endDecorator", null)
    
    inline def setEndDecoratorUndefined: Self = StObject.set(x, "endDecorator", js.undefined)
    
    inline def setEndDecoratorVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "endDecorator", js.Array(value*))
    
    inline def setEndDecoratorVdomElement(value: VdomElement): Self = StObject.set(x, "endDecorator", value.rawElement.asInstanceOf[js.Any])
    
    inline def setLevel(
      value: "body4" | "display2" | "body2" | "body5" | "h2" | "display1" | "h3" | "body1" | "h6" | "h1" | "h5" | "body3" | "h4" | "inherit"
    ): Self = StObject.set(x, "level", value.asInstanceOf[js.Any])
    
    inline def setLevelUndefined: Self = StObject.set(x, "level", js.undefined)
    
    inline def setOverlay(value: Boolean): Self = StObject.set(x, "overlay", value.asInstanceOf[js.Any])
    
    inline def setOverlayUndefined: Self = StObject.set(x, "overlay", js.undefined)
    
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
    
    inline def setTextColor(
      value: (ResponsiveStyleValue[
          js.UndefOr[
            com.olvind.mui.csstype.mod.Property.Color | js.Array[NonNullable[js.UndefOr[com.olvind.mui.csstype.mod.Property.Color]]]
          ]
        ]) | (js.Function1[
          /* theme */ com.olvind.mui.muiJoy.stylesTypesThemeMod.Theme, 
          ResponsiveStyleValue[
            js.UndefOr[
              com.olvind.mui.csstype.mod.Property.Color | js.Array[NonNullable[js.UndefOr[com.olvind.mui.csstype.mod.Property.Color]]]
            ]
          ]
        ])
    ): Self = StObject.set(x, "textColor", value.asInstanceOf[js.Any])
    
    inline def setTextColorFunction1(
      value: /* theme */ com.olvind.mui.muiJoy.stylesTypesThemeMod.Theme => ResponsiveStyleValue[
          js.UndefOr[
            com.olvind.mui.csstype.mod.Property.Color | js.Array[NonNullable[js.UndefOr[com.olvind.mui.csstype.mod.Property.Color]]]
          ]
        ]
    ): Self = StObject.set(x, "textColor", js.Any.fromFunction1(value))
    
    inline def setTextColorUndefined: Self = StObject.set(x, "textColor", js.undefined)
    
    inline def setTextColorVarargs(
      value: (js.UndefOr[
          js.Array[NonNullable[js.UndefOr[com.olvind.mui.csstype.mod.Property.Color]]] | com.olvind.mui.csstype.mod.Property.Color | NonNullable[js.UndefOr[com.olvind.mui.csstype.mod.Property.Color]] | Null
        ])*
    ): Self = StObject.set(x, "textColor", js.Array(value*))
    
    inline def setUnderline(value: "none" | "hover" | "always"): Self = StObject.set(x, "underline", value.asInstanceOf[js.Any])
    
    inline def setUnderlineUndefined: Self = StObject.set(x, "underline", js.undefined)
    
    inline def setVariant(value: OverridableStringUnion[VariantProp, LinkPropsVariantOverrides]): Self = StObject.set(x, "variant", value.asInstanceOf[js.Any])
    
    inline def setVariantUndefined: Self = StObject.set(x, "variant", js.undefined)
  }
}
