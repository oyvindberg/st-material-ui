package com.olvind.mui.muiMaterial

import com.olvind.mui.muiMaterial.selectClassesMod.SelectClasses
import com.olvind.mui.muiMaterial.selectSelectMod.SelectProps
import com.olvind.mui.react.mod.global.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object selectMod {
  
  @JSImport("@mui/material/Select", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /**
    *
    * Demos:
    *
    * - [Selects](https://mui.com/components/selects/)
    *
    * API:
    *
    * - [Select API](https://mui.com/api/select/)
    * - inherits [OutlinedInput API](https://mui.com/api/outlined-input/)
    */
  /* Inlined <T>(props : @mui/material.@mui/material/Select/Select.SelectProps<T>): react.react.<global>.JSX.Element & {  muiName :string} */
  object default {
    
    @scala.inline
    def apply[T](props: SelectProps[T]): Element = ^.asInstanceOf[js.Dynamic].apply(props.asInstanceOf[js.Any]).asInstanceOf[Element]
    
    @JSImport("@mui/material/Select", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@mui/material/Select", "default.muiName")
    @js.native
    def muiName: String = js.native
    @scala.inline
    def muiName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("muiName")(x.asInstanceOf[js.Any])
  }
  
  @scala.inline
  def getSelectUtilityClasses(slot: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getSelectUtilityClasses")(slot.asInstanceOf[js.Any]).asInstanceOf[String]
  
  @JSImport("@mui/material/Select", "selectClasses")
  @js.native
  val selectClasses: SelectClasses = js.native
}
