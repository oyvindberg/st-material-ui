package com.olvind.mui.muiJoy.anon

import com.olvind.mui.muiJoy.stylesTypesThemeMod.SxProps
import com.olvind.mui.muiSystem.styleFunctionSxStyleFunctionSxMod.SystemStyleObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OnClose extends StObject {
  
  /**
    * Callback fired when the component requests to be closed.
    * The `reason` parameter can optionally be used to control the response to `onClose`.
    *
    * @param {object} event The event source of the callback.
    * @param {string} reason Can be: `"escapeKeyDown"`, `"backdropClick"`, `"closeClick"`.
    */
  var onClose: js.UndefOr[
    js.Function2[
      /* event */ js.Object, 
      /* reason */ "backdropClick" | "escapeKeyDown" | "closeClick", 
      Unit
    ]
  ] = js.undefined
  
  /**
    * The system prop that allows defining system overrides as well as additional CSS styles.
    */
  var sx: js.UndefOr[SxProps] = js.undefined
}
object OnClose {
  
  inline def apply(): OnClose = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OnClose]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: OnClose] (val x: Self) extends AnyVal {
    
    inline def setOnClose(
      value: (/* event */ js.Object, /* reason */ "backdropClick" | "escapeKeyDown" | "closeClick") => Unit
    ): Self = StObject.set(x, "onClose", js.Any.fromFunction2(value))
    
    inline def setOnCloseUndefined: Self = StObject.set(x, "onClose", js.undefined)
    
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
