package com.olvind.mui.muiJoy.anon

import com.olvind.mui.muiJoy.stylesTypesThemeMod.SxProps
import com.olvind.mui.muiSystem.styleFunctionSxStyleFunctionSxMod.SystemStyleObject
import slinky.core.facade.ReactElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DisableColorScheme extends StObject {
  
  /**
    * You can wrap a node.
    */
  var children: js.UndefOr[ReactElement] = js.undefined
  
  /**
    * Disable `color-scheme` CSS property.
    *
    * For more details, check out https://developer.mozilla.org/en-US/docs/Web/CSS/color-scheme
    * For browser support, check out https://caniuse.com/?search=color-scheme
    * @default false
    */
  var disableColorScheme: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The system prop that allows defining system overrides as well as additional CSS styles.
    */
  var sx: js.UndefOr[SxProps] = js.undefined
}
object DisableColorScheme {
  
  inline def apply(): DisableColorScheme = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DisableColorScheme]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DisableColorScheme] (val x: Self) extends AnyVal {
    
    inline def setChildren(value: ReactElement): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
    
    inline def setDisableColorScheme(value: Boolean): Self = StObject.set(x, "disableColorScheme", value.asInstanceOf[js.Any])
    
    inline def setDisableColorSchemeUndefined: Self = StObject.set(x, "disableColorScheme", js.undefined)
    
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
  }
}
