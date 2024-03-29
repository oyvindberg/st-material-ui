package com.olvind.mui.muiMaterial.anon

import com.olvind.mui.muiMaterial.stylesCreateThemeMod.Theme
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

trait Page extends StObject {
  
  /**
    * Override or extend the styles applied to the component.
    */
  var classes: js.UndefOr[PartialPaginationItemClasses] = js.undefined
  
  /**
    * The active color.
    * It supports both default and custom theme colors, which can be added as shown in the
    * [palette customization guide](https://mui.com/material-ui/customization/palette/#adding-new-colors).
    * @default 'standard'
    */
  var color: js.UndefOr["standard" | "primary" | "secondary"] = js.undefined
  
  /**
    * The components used for each slot inside.
    *
    * This prop is an alias for the `slots` prop.
    * It's recommended to use the `slots` prop instead.
    *
    * @default {}
    */
  var components: js.UndefOr[First] = js.undefined
  
  /**
    * If `true`, the component is disabled.
    * @default false
    */
  var disabled: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The current page number.
    */
  var page: js.UndefOr[japgolly.scalajs.react.facade.React.Node] = js.undefined
  
  /**
    * If `true` the pagination item is selected.
    * @default false
    */
  var selected: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The shape of the pagination item.
    * @default 'circular'
    */
  var shape: js.UndefOr["circular" | "rounded"] = js.undefined
  
  /**
    * The size of the component.
    * @default 'medium'
    */
  var size: js.UndefOr["small" | "medium" | "large"] = js.undefined
  
  /**
    * The components used for each slot inside.
    *
    * This prop is an alias for the `components` prop, which will be deprecated in the future.
    *
    * @default {}
    */
  var slots: js.UndefOr[First] = js.undefined
  
  /**
    * The system prop that allows defining system overrides as well as additional CSS styles.
    */
  var sx: js.UndefOr[SxProps[Theme]] = js.undefined
  
  /**
    * The type of pagination item.
    * @default 'page'
    */
  var `type`: js.UndefOr[
    "page" | "first" | "last" | "next" | "previous" | "start-ellipsis" | "end-ellipsis"
  ] = js.undefined
  
  /**
    * The variant to use.
    * @default 'text'
    */
  var variant: js.UndefOr["text" | "outlined"] = js.undefined
}
object Page {
  
  inline def apply(): Page = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Page]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Page] (val x: Self) extends AnyVal {
    
    inline def setClasses(value: PartialPaginationItemClasses): Self = StObject.set(x, "classes", value.asInstanceOf[js.Any])
    
    inline def setClassesUndefined: Self = StObject.set(x, "classes", js.undefined)
    
    inline def setColor(value: "standard" | "primary" | "secondary"): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
    
    inline def setComponents(value: First): Self = StObject.set(x, "components", value.asInstanceOf[js.Any])
    
    inline def setComponentsUndefined: Self = StObject.set(x, "components", js.undefined)
    
    inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
    
    inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
    
    inline def setPage(value: VdomNode): Self = StObject.set(x, "page", value.rawNode.asInstanceOf[js.Any])
    
    inline def setPageNull: Self = StObject.set(x, "page", null)
    
    inline def setPageUndefined: Self = StObject.set(x, "page", js.undefined)
    
    inline def setPageVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "page", js.Array(value*))
    
    inline def setPageVdomElement(value: VdomElement): Self = StObject.set(x, "page", value.rawElement.asInstanceOf[js.Any])
    
    inline def setSelected(value: Boolean): Self = StObject.set(x, "selected", value.asInstanceOf[js.Any])
    
    inline def setSelectedUndefined: Self = StObject.set(x, "selected", js.undefined)
    
    inline def setShape(value: "circular" | "rounded"): Self = StObject.set(x, "shape", value.asInstanceOf[js.Any])
    
    inline def setShapeUndefined: Self = StObject.set(x, "shape", js.undefined)
    
    inline def setSize(value: "small" | "medium" | "large"): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    
    inline def setSlots(value: First): Self = StObject.set(x, "slots", value.asInstanceOf[js.Any])
    
    inline def setSlotsUndefined: Self = StObject.set(x, "slots", js.undefined)
    
    inline def setSx(value: SxProps[Theme]): Self = StObject.set(x, "sx", value.asInstanceOf[js.Any])
    
    inline def setSxFunction1(value: Theme => SystemStyleObject[Theme]): Self = StObject.set(x, "sx", js.Any.fromFunction1(value))
    
    inline def setSxNull: Self = StObject.set(x, "sx", null)
    
    inline def setSxUndefined: Self = StObject.set(x, "sx", js.undefined)
    
    inline def setSxVarargs(value: (Boolean | SystemStyleObject[Theme] | (js.Function1[Theme, SystemStyleObject[Theme]]))*): Self = StObject.set(x, "sx", js.Array(value*))
    
    inline def setType(value: "page" | "first" | "last" | "next" | "previous" | "start-ellipsis" | "end-ellipsis"): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    inline def setVariant(value: "text" | "outlined"): Self = StObject.set(x, "variant", value.asInstanceOf[js.Any])
    
    inline def setVariantUndefined: Self = StObject.set(x, "variant", js.undefined)
  }
}
