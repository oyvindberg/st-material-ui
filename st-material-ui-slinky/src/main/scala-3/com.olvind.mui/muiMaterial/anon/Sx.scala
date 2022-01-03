package com.olvind.mui.muiMaterial.anon

import com.olvind.mui.muiSystem.styleFunctionSxStyleFunctionSxMod.SxProps
import com.olvind.mui.muiSystem.styleFunctionSxStyleFunctionSxMod.SystemStyleObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Sx extends StObject {
  
  /**
    * Override or extend the styles applied to the component.
    */
  var classes: js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: @mui/material.anon.BackdropUnstyledTypeMapdivprops['classes'] */ js.Any
  ] = js.undefined
  
  /**
    * If `true`, the component is shown.
    */
  var open: Boolean
  
  /**
    * The system prop that allows defining system overrides as well as additional CSS styles.
    */
  var sx: js.UndefOr[SxProps[com.olvind.mui.muiMaterial.createThemeMod.Theme]] = js.undefined
  
  /**
    * The duration for the transition, in milliseconds.
    * You may specify a single timeout for all transitions, or individually with an object.
    */
  var transitionDuration: js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: @mui/material.@mui/material/transitions/transition.TransitionProps['timeout'] */ js.Any
  ] = js.undefined
}
object Sx {
  
  inline def apply(open: Boolean): Sx = {
    val __obj = js.Dynamic.literal(open = open.asInstanceOf[js.Any])
    __obj.asInstanceOf[Sx]
  }
  
  extension [Self <: Sx](x: Self) {
    
    inline def setClasses(
      value: /* import warning: importer.ImportType#apply Failed type conversion: @mui/material.anon.BackdropUnstyledTypeMapdivprops['classes'] */ js.Any
    ): Self = StObject.set(x, "classes", value.asInstanceOf[js.Any])
    
    inline def setClassesUndefined: Self = StObject.set(x, "classes", js.undefined)
    
    inline def setOpen(value: Boolean): Self = StObject.set(x, "open", value.asInstanceOf[js.Any])
    
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
    
    inline def setTransitionDuration(
      value: /* import warning: importer.ImportType#apply Failed type conversion: @mui/material.@mui/material/transitions/transition.TransitionProps['timeout'] */ js.Any
    ): Self = StObject.set(x, "transitionDuration", value.asInstanceOf[js.Any])
    
    inline def setTransitionDurationUndefined: Self = StObject.set(x, "transitionDuration", js.undefined)
  }
}
