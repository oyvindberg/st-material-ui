package com.olvind.mui.muiMaterial.anon

import com.olvind.mui.muiMaterial.muiMaterialStrings.always
import com.olvind.mui.muiMaterial.muiMaterialStrings.hover
import com.olvind.mui.muiMaterial.muiMaterialStrings.inherit
import com.olvind.mui.muiMaterial.muiMaterialStrings.none
import com.olvind.mui.muiMaterial.stylesMod.ClassNameMap
import com.olvind.mui.muiSystem.styleFunctionSxStyleFunctionSxMod.ResponsiveStyleValue
import com.olvind.mui.muiSystem.styleFunctionSxStyleFunctionSxMod.SxProps
import com.olvind.mui.muiSystem.styleFunctionSxStyleFunctionSxMod.SystemStyleObject
import com.olvind.mui.std.NonNullable
import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypographyClasses extends StObject {
  
  /**
    * `classes` prop applied to the [`Typography`](/api/typography/) element.
    */
  var TypographyClasses: js.UndefOr[
    js.UndefOr[PartialTypographyClasses] & js.UndefOr[com.olvind.mui.std.Partial[ClassNameMap[scala.Nothing]]]
  ] = js.undefined
  
  /**
    * The content of the component.
    */
  var children: js.UndefOr[japgolly.scalajs.react.facade.React.Node] = js.undefined
  
  /**
    * Override or extend the styles applied to the component.
    */
  var classes: js.UndefOr[PartialLinkClasses] = js.undefined
  
  /**
    * The color of the link.
    * @default 'primary'
    */
  var color: js.UndefOr[
    (ResponsiveStyleValue[
      js.UndefOr[
        com.olvind.mui.csstype.mod.Property.Color | js.Array[NonNullable[js.UndefOr[com.olvind.mui.csstype.mod.Property.Color]]]
      ]
    ]) | (js.Function1[
      /* theme */ com.olvind.mui.muiMaterial.createThemeMod.Theme, 
      ResponsiveStyleValue[
        js.UndefOr[
          com.olvind.mui.csstype.mod.Property.Color | js.Array[NonNullable[js.UndefOr[com.olvind.mui.csstype.mod.Property.Color]]]
        ]
      ]
    ])
  ] = js.undefined
  
  /**
    * The system prop that allows defining system overrides as well as additional CSS styles.
    */
  var sx: js.UndefOr[SxProps[com.olvind.mui.muiMaterial.createThemeMod.Theme]] = js.undefined
  
  /**
    * Controls when the link should have an underline.
    * @default 'always'
    */
  var underline: js.UndefOr[none | hover | always] = js.undefined
  
  /**
    * Applies the theme typography styles.
    * @default 'inherit'
    */
  var variant: js.UndefOr[com.olvind.mui.muiMaterial.createTypographyMod.Variant | inherit] = js.undefined
}
object TypographyClasses {
  
  inline def apply(): TypographyClasses = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TypographyClasses]
  }
  
  extension [Self <: TypographyClasses](x: Self) {
    
    inline def setChildren(value: VdomNode): Self = StObject.set(x, "children", value.rawNode.asInstanceOf[js.Any])
    
    inline def setChildrenNull: Self = StObject.set(x, "children", null)
    
    inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
    
    inline def setChildrenVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "children", js.Array(value*))
    
    inline def setChildrenVdomElement(value: VdomElement): Self = StObject.set(x, "children", value.rawElement.asInstanceOf[js.Any])
    
    inline def setClasses(value: PartialLinkClasses): Self = StObject.set(x, "classes", value.asInstanceOf[js.Any])
    
    inline def setClassesUndefined: Self = StObject.set(x, "classes", js.undefined)
    
    inline def setColor(
      value: (ResponsiveStyleValue[
          js.UndefOr[
            com.olvind.mui.csstype.mod.Property.Color | js.Array[NonNullable[js.UndefOr[com.olvind.mui.csstype.mod.Property.Color]]]
          ]
        ]) | (js.Function1[
          /* theme */ com.olvind.mui.muiMaterial.createThemeMod.Theme, 
          ResponsiveStyleValue[
            js.UndefOr[
              com.olvind.mui.csstype.mod.Property.Color | js.Array[NonNullable[js.UndefOr[com.olvind.mui.csstype.mod.Property.Color]]]
            ]
          ]
        ])
    ): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    inline def setColorFunction1(
      value: /* theme */ com.olvind.mui.muiMaterial.createThemeMod.Theme => ResponsiveStyleValue[
          js.UndefOr[
            com.olvind.mui.csstype.mod.Property.Color | js.Array[NonNullable[js.UndefOr[com.olvind.mui.csstype.mod.Property.Color]]]
          ]
        ]
    ): Self = StObject.set(x, "color", js.Any.fromFunction1(value))
    
    inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
    
    inline def setColorVarargs(
      value: (js.UndefOr[
          js.Array[NonNullable[js.UndefOr[com.olvind.mui.csstype.mod.Property.Color]]] | com.olvind.mui.csstype.mod.Property.Color | NonNullable[js.UndefOr[com.olvind.mui.csstype.mod.Property.Color]] | Null
        ])*
    ): Self = StObject.set(x, "color", js.Array(value*))
    
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
    
    inline def setTypographyClasses(
      value: js.UndefOr[PartialTypographyClasses] & js.UndefOr[com.olvind.mui.std.Partial[ClassNameMap[scala.Nothing]]]
    ): Self = StObject.set(x, "TypographyClasses", value.asInstanceOf[js.Any])
    
    inline def setTypographyClassesUndefined: Self = StObject.set(x, "TypographyClasses", js.undefined)
    
    inline def setUnderline(value: none | hover | always): Self = StObject.set(x, "underline", value.asInstanceOf[js.Any])
    
    inline def setUnderlineUndefined: Self = StObject.set(x, "underline", js.undefined)
    
    inline def setVariant(value: com.olvind.mui.muiMaterial.createTypographyMod.Variant | inherit): Self = StObject.set(x, "variant", value.asInstanceOf[js.Any])
    
    inline def setVariantUndefined: Self = StObject.set(x, "variant", js.undefined)
  }
}
