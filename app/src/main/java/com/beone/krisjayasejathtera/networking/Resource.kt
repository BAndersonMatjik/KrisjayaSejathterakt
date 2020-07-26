package com.beone.krisjayasejathtera.networking

class Resource<T>(status: Status, data: T?, message: String?) {
    val status: Status
    val data: T?
    val message: String?

    companion object {
        /***
         *
         * @param data
         * @param <T>
         * @return
         * success
        </T> */
        fun <T> success(data: T): Resource<T> {
            return Resource(Status.SUCCESS, data, null)
        }

        /***
         *
         * @param msg
         * @param data
         * @param <T>
         * @return
         * error
        </T> */
        fun <T> error(msg: String?, data: T?): Resource<T?> {
            return Resource(Status.ERROR, data, msg)
        }

        /***
         *
         * @param data
         * @param <T>
         * @return
         * loading
        </T> */
        fun <T> loading(data: T?): Resource<T?> {
            return Resource(Status.LOADING, data, null)
        }
    }

    /***
     *
     * @param status
     * @param data
     * @param message
     * Constructor
     */
    init {
        this.status = status
        this.data = data
        this.message = message
    }
}