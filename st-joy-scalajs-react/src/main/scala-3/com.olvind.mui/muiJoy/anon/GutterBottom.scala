package com.olvind.mui.muiJoy.anon

import com.olvind.mui.muiJoy.stylesTypesColorSystemMod.ColorPaletteProp
import com.olvind.mui.muiJoy.stylesTypesThemeMod.SxProps
import com.olvind.mui.muiJoy.stylesTypesVariantsMod.VariantProp
import com.olvind.mui.muiJoy.typographyTypographyPropsMod.TypographyPropsColorOverrides
import com.olvind.mui.muiJoy.typographyTypographyPropsMod.TypographyPropsVariantOverrides
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

trait GutterBottom extends StObject {
  
  /**
    * The content of the component.
    */
  var children: js.UndefOr[Node] = js.undefined
  
  /**
    * The color of the component. It supports those theme colors that make sense for this component.
    */
  var color: js.UndefOr[OverridableStringUnion[ColorPaletteProp, TypographyPropsColorOverrides]] = js.undefined
  
  /**
    * Element placed after the children.
    */
  var endDecorator: js.UndefOr[Node] = js.undefined
  
  /**
    * If `true`, the text will have a bottom margin.
    * @default false
    */
  var gutterBottom: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Applies the theme typography styles.
    * @default 'body1'
    */
  var level: js.UndefOr[
    "body4" | "display2" | "body2" | "body5" | "h2" | "display1" | "h3" | "body1" | "h6" | "h1" | "h5" | "body3" | "h4" | "inherit"
  ] = js.undefined
  
  /**
    * The component maps the variant prop to a range of different HTML element types.
    * For instance, body1 to `<h6>`.
    * If you wish to change that mapping, you can provide your own.
    * Alternatively, you can use the `component` prop.
    * @default {
    *   h1: 'h1',
    *   h2: 'h2',
    *   h3: 'h3',
    *   h4: 'h4',
    *   h5: 'h5',
    *   h6: 'h6',
    *   body1: 'p',
    *   body2: 'p',
    *   body3: 'p',
    *   inherit: 'p',
    * }
    */
  var levelMapping: js.UndefOr[PartialRecordkeyofTypographySysteminheri] = js.undefined
  
  /**
    * If `true`, the text will not wrap, but instead will truncate with a text overflow ellipsis.
    *
    * Note that text overflow can only happen with block or inline-block level elements
    * (the element needs to have a width in order to overflow).
    * @default false
    */
  var noWrap: js.UndefOr[Boolean] = js.undefined
  
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
    * The variant to use.
    */
  var variant: js.UndefOr[OverridableStringUnion[VariantProp, TypographyPropsVariantOverrides]] = js.undefined
}
object GutterBottom {
  
  inline def apply(): GutterBottom = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GutterBottom]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GutterBottom] (val x: Self) extends AnyVal {
    
    inline def setChildren(value: VdomNode): Self = StObject.set(x, "children", value.rawNode.asInstanceOf[js.Any])
    
    inline def setChildrenNull: Self = StObject.set(x, "children", null)
    
    inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
    
    inline def setChildrenVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "children", js.Array(value*))
    
    inline def setChildrenVdomElement(value: VdomElement): Self = StObject.set(x, "children", value.rawElement.asInstanceOf[js.Any])
    
    inline def setColor(value: OverridableStringUnion[ColorPaletteProp, TypographyPropsColorOverrides]): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
    
    inline def setEndDecorator(value: VdomNode): Self = StObject.set(x, "endDecorator", value.rawNode.asInstanceOf[js.Any])
    
    inline def setEndDecoratorNull: Self = StObject.set(x, "endDecorator", null)
    
    inline def setEndDecoratorUndefined: Self = StObject.set(x, "endDecorator", js.undefined)
    
    inline def setEndDecoratorVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "endDecorator", js.Array(value*))
    
    inline def setEndDecoratorVdomElement(value: VdomElement): Self = StObject.set(x, "endDecorator", value.rawElement.asInstanceOf[js.Any])
    
    inline def setGutterBottom(value: Boolean): Self = StObject.set(x, "gutterBottom", value.asInstanceOf[js.Any])
    
    inline def setGutterBottomUndefined: Self = StObject.set(x, "gutterBottom", js.undefined)
    
    inline def setLevel(
      value: "body4" | "display2" | "body2" | "body5" | "h2" | "display1" | "h3" | "body1" | "h6" | "h1" | "h5" | "body3" | "h4" | "inherit"
    ): Self = StObject.set(x, "level", value.asInstanceOf[js.Any])
    
    inline def setLevelMapping(value: PartialRecordkeyofTypographySysteminheri): Self = StObject.set(x, "levelMapping", value.asInstanceOf[js.Any])
    
    inline def setLevelMappingUndefined: Self = StObject.set(x, "levelMapping", js.undefined)
    
    inline def setLevelUndefined: Self = StObject.set(x, "level", js.undefined)
    
    inline def setNoWrap(value: Boolean): Self = StObject.set(x, "noWrap", value.asInstanceOf[js.Any])
    
    inline def setNoWrapUndefined: Self = StObject.set(x, "noWrap", js.undefined)
    
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
    
    inline def setVariant(value: OverridableStringUnion[VariantProp, TypographyPropsVariantOverrides]): Self = StObject.set(x, "variant", value.asInstanceOf[js.Any])
    
    inline def setVariantUndefined: Self = StObject.set(x, "variant", js.undefined)
  }
}
