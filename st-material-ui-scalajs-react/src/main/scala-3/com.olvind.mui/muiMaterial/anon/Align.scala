package com.olvind.mui.muiMaterial.anon

import com.olvind.mui.muiMaterial.muiMaterialStrings.center
import com.olvind.mui.muiMaterial.muiMaterialStrings.inherit
import com.olvind.mui.muiMaterial.muiMaterialStrings.justify
import com.olvind.mui.muiMaterial.muiMaterialStrings.left
import com.olvind.mui.muiMaterial.muiMaterialStrings.right
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

trait Align extends StObject {
  
  /**
    * Set the text-align on the component.
    * @default 'inherit'
    */
  var align: js.UndefOr[inherit | left | center | right | justify] = js.undefined
  
  /**
    * The content of the component.
    */
  var children: js.UndefOr[japgolly.scalajs.react.facade.React.Node] = js.undefined
  
  /**
    * Override or extend the styles applied to the component.
    */
  var classes: js.UndefOr[PartialTypographyClasses] = js.undefined
  
  /**
    * If `true`, the text will have a bottom margin.
    * @default false
    */
  var gutterBottom: js.UndefOr[Boolean] = js.undefined
  
  /**
    * If `true`, the text will not wrap, but instead will truncate with a text overflow ellipsis.
    *
    * Note that text overflow can only happen with block or inline-block level elements
    * (the element needs to have a width in order to overflow).
    * @default false
    */
  var noWrap: js.UndefOr[Boolean] = js.undefined
  
  /**
    * If `true`, the element will be a paragraph element.
    * @default false
    */
  var paragraph: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The system prop that allows defining system overrides as well as additional CSS styles.
    */
  var sx: js.UndefOr[SxProps[com.olvind.mui.muiMaterial.createThemeMod.Theme]] = js.undefined
  
  /**
    * Applies the theme typography styles.
    * @default 'body1'
    */
  var variant: js.UndefOr[com.olvind.mui.muiMaterial.createTypographyMod.Variant | inherit] = js.undefined
  
  /**
    * The component maps the variant prop to a range of different HTML element types.
    * For instance, subtitle1 to `<h6>`.
    * If you wish to change that mapping, you can provide your own.
    * Alternatively, you can use the `component` prop.
    * @default {
    *   h1: 'h1',
    *   h2: 'h2',
    *   h3: 'h3',
    *   h4: 'h4',
    *   h5: 'h5',
    *   h6: 'h6',
    *   subtitle1: 'h6',
    *   subtitle2: 'h6',
    *   body1: 'p',
    *   body2: 'p',
    *   inherit: 'p',
    * }
    */
  var variantMapping: js.UndefOr[PartialRecordVariantinheritstring] = js.undefined
}
object Align {
  
  inline def apply(): Align = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Align]
  }
  
  extension [Self <: Align](x: Self) {
    
    inline def setAlign(value: inherit | left | center | right | justify): Self = StObject.set(x, "align", value.asInstanceOf[js.Any])
    
    inline def setAlignUndefined: Self = StObject.set(x, "align", js.undefined)
    
    inline def setChildren(value: VdomNode): Self = StObject.set(x, "children", value.rawNode.asInstanceOf[js.Any])
    
    inline def setChildrenNull: Self = StObject.set(x, "children", null)
    
    inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
    
    inline def setChildrenVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "children", js.Array(value*))
    
    inline def setChildrenVdomElement(value: VdomElement): Self = StObject.set(x, "children", value.rawElement.asInstanceOf[js.Any])
    
    inline def setClasses(value: PartialTypographyClasses): Self = StObject.set(x, "classes", value.asInstanceOf[js.Any])
    
    inline def setClassesUndefined: Self = StObject.set(x, "classes", js.undefined)
    
    inline def setGutterBottom(value: Boolean): Self = StObject.set(x, "gutterBottom", value.asInstanceOf[js.Any])
    
    inline def setGutterBottomUndefined: Self = StObject.set(x, "gutterBottom", js.undefined)
    
    inline def setNoWrap(value: Boolean): Self = StObject.set(x, "noWrap", value.asInstanceOf[js.Any])
    
    inline def setNoWrapUndefined: Self = StObject.set(x, "noWrap", js.undefined)
    
    inline def setParagraph(value: Boolean): Self = StObject.set(x, "paragraph", value.asInstanceOf[js.Any])
    
    inline def setParagraphUndefined: Self = StObject.set(x, "paragraph", js.undefined)
    
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
    
    inline def setVariant(value: com.olvind.mui.muiMaterial.createTypographyMod.Variant | inherit): Self = StObject.set(x, "variant", value.asInstanceOf[js.Any])
    
    inline def setVariantMapping(value: PartialRecordVariantinheritstring): Self = StObject.set(x, "variantMapping", value.asInstanceOf[js.Any])
    
    inline def setVariantMappingUndefined: Self = StObject.set(x, "variantMapping", js.undefined)
    
    inline def setVariantUndefined: Self = StObject.set(x, "variant", js.undefined)
  }
}
