package com.olvind.mui.muiMaterial.anon

import com.olvind.mui.muiSystem.styleFunctionSxStyleFunctionSxMod.SxProps
import com.olvind.mui.muiSystem.styleFunctionSxStyleFunctionSxMod.SystemStyleObject
import japgolly.scalajs.react.facade.React.ElementType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BackdropComponent extends StObject {
  
  /**
    * A backdrop component. This prop enables custom backdrop rendering.
    * @default styled(Backdrop, {
    *   name: 'MuiModal',
    *   slot: 'Backdrop',
    *   overridesResolver: (props, styles) => {
    *     return styles.backdrop;
    *   },
    * })({
    *   zIndex: -1,
    * })
    */
  var BackdropComponent: js.UndefOr[ElementType] = js.undefined
  
  /**
    * Props applied to the [`Backdrop`](/api/backdrop/) element.
    */
  var BackdropProps: js.UndefOr[PartialBackdropPropsBackdropTypeMapspand] = js.undefined
  
  /**
    * The system prop that allows defining system overrides as well as additional CSS styles.
    */
  var sx: js.UndefOr[SxProps[com.olvind.mui.muiMaterial.createThemeMod.Theme]] = js.undefined
}
object BackdropComponent {
  
  inline def apply(): BackdropComponent = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BackdropComponent]
  }
  
  extension [Self <: BackdropComponent](x: Self) {
    
    inline def setBackdropComponent(value: ElementType): Self = StObject.set(x, "BackdropComponent", value.asInstanceOf[js.Any])
    
    inline def setBackdropComponentUndefined: Self = StObject.set(x, "BackdropComponent", js.undefined)
    
    inline def setBackdropProps(value: PartialBackdropPropsBackdropTypeMapspand): Self = StObject.set(x, "BackdropProps", value.asInstanceOf[js.Any])
    
    inline def setBackdropPropsUndefined: Self = StObject.set(x, "BackdropProps", js.undefined)
    
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
  }
}
