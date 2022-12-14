package com.olvind.mui.muiMaterial.anon

import com.olvind.mui.muiMaterial.stylesCreateThemeMod.Theme
import com.olvind.mui.muiSystem.mod.ResponsiveStyleValue
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

trait Direction extends StObject {
  
  /**
    * The content of the component.
    */
  var children: js.UndefOr[japgolly.scalajs.react.facade.React.Node] = js.undefined
  
  /**
    * Defines the `flex-direction` style property.
    * It is applied for all screen sizes.
    * @default 'column'
    */
  var direction: js.UndefOr[ResponsiveStyleValue["row" | "row-reverse" | "column" | "column-reverse"]] = js.undefined
  
  /**
    * Add an element between each child.
    */
  var divider: js.UndefOr[japgolly.scalajs.react.facade.React.Node] = js.undefined
  
  /**
    * Defines the space between immediate children.
    * @default 0
    */
  var spacing: js.UndefOr[ResponsiveStyleValue[Double | String]] = js.undefined
  
  /**
    * The system prop, which allows defining system overrides as well as additional CSS styles.
    */
  var sx: js.UndefOr[SxProps[Theme]] = js.undefined
  
  /**
    * If `true`, the CSS flexbox `gap` is used instead of applying `margin` to children.
    *
    * While CSS `gap` removes the [known limitations](https://mui.com/joy-ui/react-stack#limitations),
    * it is not fully supported in some browsers. We recommend checking https://caniuse.com/?search=flex%20gap before using this flag.
    *
    * To enable this flag globally, follow the [theme's default props](https://mui.com/material-ui/customization/theme-components/#default-props) configuration.
    * @default false
    */
  var useFlexGap: js.UndefOr[Boolean] = js.undefined
}
object Direction {
  
  inline def apply(): Direction = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Direction]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Direction] (val x: Self) extends AnyVal {
    
    inline def setChildren(value: VdomNode): Self = StObject.set(x, "children", value.rawNode.asInstanceOf[js.Any])
    
    inline def setChildrenNull: Self = StObject.set(x, "children", null)
    
    inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
    
    inline def setChildrenVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "children", js.Array(value*))
    
    inline def setChildrenVdomElement(value: VdomElement): Self = StObject.set(x, "children", value.rawElement.asInstanceOf[js.Any])
    
    inline def setDirection(value: ResponsiveStyleValue["row" | "row-reverse" | "column" | "column-reverse"]): Self = StObject.set(x, "direction", value.asInstanceOf[js.Any])
    
    inline def setDirectionUndefined: Self = StObject.set(x, "direction", js.undefined)
    
    inline def setDirectionVarargs(value: (("row" | "row-reverse" | "column" | "column-reverse") | Null)*): Self = StObject.set(x, "direction", js.Array(value*))
    
    inline def setDivider(value: VdomNode): Self = StObject.set(x, "divider", value.rawNode.asInstanceOf[js.Any])
    
    inline def setDividerNull: Self = StObject.set(x, "divider", null)
    
    inline def setDividerUndefined: Self = StObject.set(x, "divider", js.undefined)
    
    inline def setDividerVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "divider", js.Array(value*))
    
    inline def setDividerVdomElement(value: VdomElement): Self = StObject.set(x, "divider", value.rawElement.asInstanceOf[js.Any])
    
    inline def setSpacing(value: ResponsiveStyleValue[Double | String]): Self = StObject.set(x, "spacing", value.asInstanceOf[js.Any])
    
    inline def setSpacingUndefined: Self = StObject.set(x, "spacing", js.undefined)
    
    inline def setSpacingVarargs(value: ((Double | String) | Null)*): Self = StObject.set(x, "spacing", js.Array(value*))
    
    inline def setSx(value: SxProps[Theme]): Self = StObject.set(x, "sx", value.asInstanceOf[js.Any])
    
    inline def setSxFunction1(value: Theme => SystemStyleObject[Theme]): Self = StObject.set(x, "sx", js.Any.fromFunction1(value))
    
    inline def setSxNull: Self = StObject.set(x, "sx", null)
    
    inline def setSxUndefined: Self = StObject.set(x, "sx", js.undefined)
    
    inline def setSxVarargs(value: (Boolean | SystemStyleObject[Theme] | (js.Function1[Theme, SystemStyleObject[Theme]]))*): Self = StObject.set(x, "sx", js.Array(value*))
    
    inline def setUseFlexGap(value: Boolean): Self = StObject.set(x, "useFlexGap", value.asInstanceOf[js.Any])
    
    inline def setUseFlexGapUndefined: Self = StObject.set(x, "useFlexGap", js.undefined)
  }
}
