package com.olvind.mui.muiJoy.anon

import com.olvind.mui.muiJoy.stylesTypesThemeMod.SxProps
import com.olvind.mui.muiSystem.mod.ResponsiveStyleValue
import com.olvind.mui.muiSystem.styleFunctionSxStyleFunctionSxMod.SystemStyleObject
import slinky.core.facade.ReactElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Direction extends StObject {
  
  /**
    * The content of the component.
    */
  var children: js.UndefOr[ReactElement] = js.undefined
  
  /**
    * Defines the `flex-direction` style property.
    * It is applied for all screen sizes.
    * @default 'column'
    */
  var direction: js.UndefOr[ResponsiveStyleValue["row" | "row-reverse" | "column" | "column-reverse"]] = js.undefined
  
  /**
    * Add an element between each child.
    */
  var divider: js.UndefOr[ReactElement] = js.undefined
  
  /**
    * Defines the space between immediate children.
    * @default 0
    */
  var spacing: js.UndefOr[ResponsiveStyleValue[Double | String]] = js.undefined
  
  /**
    * The system prop, which allows defining system overrides as well as additional CSS styles.
    */
  var sx: js.UndefOr[SxProps] = js.undefined
  
  /**
    * If `true`, the CSS flexbox `gap` is used instead of applying `margin` to children.
    *
    * While CSS `gap` removes the [known limitations](https://mui.com/joy-ui/react-stack#limitations),
    * it is not fully supported in some browsers. We recommend checking https://caniuse.com/?search=flex%20gap before using this flag.
    *
    * To enable this flag globally, follow the [theme's default props](https://mui.com/joy-ui/customization/themed-components/#default-props) configuration.
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
    
    inline def setChildren(value: ReactElement): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
    
    inline def setDirection(value: ResponsiveStyleValue["row" | "row-reverse" | "column" | "column-reverse"]): Self = StObject.set(x, "direction", value.asInstanceOf[js.Any])
    
    inline def setDirectionUndefined: Self = StObject.set(x, "direction", js.undefined)
    
    inline def setDirectionVarargs(value: (("row" | "row-reverse" | "column" | "column-reverse") | Null)*): Self = StObject.set(x, "direction", js.Array(value*))
    
    inline def setDivider(value: ReactElement): Self = StObject.set(x, "divider", value.asInstanceOf[js.Any])
    
    inline def setDividerUndefined: Self = StObject.set(x, "divider", js.undefined)
    
    inline def setSpacing(value: ResponsiveStyleValue[Double | String]): Self = StObject.set(x, "spacing", value.asInstanceOf[js.Any])
    
    inline def setSpacingUndefined: Self = StObject.set(x, "spacing", js.undefined)
    
    inline def setSpacingVarargs(value: ((Double | String) | Null)*): Self = StObject.set(x, "spacing", js.Array(value*))
    
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
    
    inline def setUseFlexGap(value: Boolean): Self = StObject.set(x, "useFlexGap", value.asInstanceOf[js.Any])
    
    inline def setUseFlexGapUndefined: Self = StObject.set(x, "useFlexGap", js.undefined)
  }
}
